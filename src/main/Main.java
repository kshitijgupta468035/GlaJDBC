package main;


import connection.DatabaseConnection;
import data.Student;
import databaseHelper.StudentEntryHelper;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        // create the connection to the database
        DatabaseConnection connection = new DatabaseConnection();
        connection.startConnection();
        connection.printConnectionStatus();
        // create an object to the Entry Helper Class
        StudentEntryHelper entryHelper = new StudentEntryHelper();

        int studentRollNumber = entryHelper.getRollNumberFromUser();
        String studentName = entryHelper.getNameFromUser();
        int studentYear = entryHelper.getYearFromUser();
        double studentCurrentCPI = entryHelper.getCPIFromUser();
        // Create the Student object
        Student student = new Student(studentRollNumber, studentName, studentYear, studentCurrentCPI);
        // Send the student object to the database
        //entryHelper.createNewStudentInDatabase(DatabaseConnection.getConnection(), student);
        //entryHelper.checkIfStudentCreated();*/

        // read operation on the table data
        entryHelper.readAllRecordsInStudentTable();

        // search for a student in the database with the roll number
        //entryHelper.searchForStudentInDatabase(4);


    }
}
