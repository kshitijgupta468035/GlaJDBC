package practice11;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        InputTen ten = new InputTen();
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        list = ten.create10(length);
        System.out.println(list);
    }
}
