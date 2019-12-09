package demo1;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DemoPre {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://" +
                    "localhost/demo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&server" +
                    "Timezone=IST", "root", "");
            String sql = "INSERT INTO employee (ID, NAME, EMAIL, SALARY) VALUES (?,?,?,?)";
            PreparedStatement prepare = con.prepareStatement(sql);
            for (int i = 0; i < 2; i++) {
                prepare.setInt(1, scan.nextInt());
                scan.nextLine();
                prepare.setString(2, scan.nextLine());
                prepare.setString(3, scan.nextLine());
                prepare.setDouble(4, scan.nextDouble());

                int rows = prepare.executeUpdate();
                System.out.println("No of rows effected " + rows);
            }

            Statement statement = con.createStatement();
            String sql1 = "SELECT * FROM employee";
            ResultSet result = statement.executeQuery(sql1);
            ArrayList<Employee> list = new ArrayList<Employee>();
            while (result.next()) {
                Employee employee = new Employee();
                int id = result.getInt(1);
                String name = result.getString(2);
                String email = result.getString(3);
                double salary = result.getDouble(4);
                employee.setId(id);
                employee.setName(name);
                employee.setEmail(email);
                employee.setSalary(salary);

                list.add(employee);
            }

            for (Employee employee : list
            ) {
                System.out.println(employee);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
