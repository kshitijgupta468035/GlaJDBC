package prctice6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p = scan.nextInt();

        Mycalculator cal = new Mycalculator();
        long powerOfNumbers = cal.power(n,p);
        System.out.println(powerOfNumbers);
    }
}
