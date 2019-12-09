package practice9;

import java.util.ArrayList;
import java.util.Scanner;

public class ThreadUsage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of integers you want to enter" +
                " in the arraylist ");
        int number = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            list.add((int) (Math.random() * 10));
        }
        System.out.println(list);
    }
}
