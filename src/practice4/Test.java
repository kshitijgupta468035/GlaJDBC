package practice4;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number of Students");
        int number = Integer.parseInt(scan.nextLine());
        String[] array = new String[number];
        for (int i = 0; i < number; i++) {
            String name = scan.nextLine();
            int age = Integer.parseInt(scan.nextLine());
            double percentage = Double.parseDouble(scan.nextLine());
            Student data = new Student(name, age, percentage);
            array[i] = data.checker();
        }
        System.out.println(Arrays.toString(array));


    }
}

