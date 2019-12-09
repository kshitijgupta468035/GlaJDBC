package practice8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine().trim();
        Programming p = new Programming();
        Programming p1 = new Programming(name);
        scan.close();
    }
}
