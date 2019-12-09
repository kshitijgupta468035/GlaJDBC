package practice11;

import java.util.ArrayList;
import java.util.Scanner;

public class InputTen {

    public ArrayList<Integer> create10(int length) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            int a = scan.nextInt();
            list.add(a);
        }
        return list;
    }
}
