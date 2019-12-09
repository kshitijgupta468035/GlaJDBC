package demo;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DemoPreparedStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://" +
                    "localhost/demo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&server" +
                    "Timezone=IST", "root", "");
            //building sql for task 1
            String sql = "INSERT INTO employee (ID, NAME, EMAIL, SALARY) VALUES (?,?,?,?)";
            //preparing statement
            PreparedStatement pstmt = con.prepareStatement(sql);
            //loop to enter 10 records
            for (int i = 0; i < 2; i++) {

                //setting parameters
                pstmt.setInt(1, sc.nextInt());
                sc.nextLine();
                pstmt.setString(2, sc.nextLine());
                pstmt.setString(3, sc.nextLine());
                pstmt.setDouble(4, sc.nextDouble());
                //executing SQL
                int rows = pstmt.executeUpdate();
                //processing result
                System.out.println("no of rows affected = " + rows);

            }
            //preparing statement for task 2
            Statement stmt = con.createStatement();
            //building sql for task2
            String sql1 = "SELECT * FROM employee";
            //executing sql
            ResultSet rs = stmt.executeQuery(sql1);
            //creating ArrayList
            ArrayList<Employee> list = new ArrayList<>();
            while (rs.next()) {
                //creating employee object
                Employee e = new Employee();
                //getting values fro resultset
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String email = rs.getString(3);
                double salary = rs.getDouble(4);
                //setting values in employee objec
                e.setId(id);
                e.setName(name);
                e.setEmail(email);
                e.setSalary(salary);
                /// adding the object into list
                list.add(e);

            }
            //printing the list
            for (Employee e : list) {
                System.out.println(e);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
