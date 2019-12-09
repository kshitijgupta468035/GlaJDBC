package practice5;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        try {
            int data = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception Handled");
        } finally {
            System.out.println("done");
        }
    }
}
