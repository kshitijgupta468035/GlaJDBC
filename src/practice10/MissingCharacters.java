package practice10;

import java.util.ArrayList;
import java.util.Scanner;

public class MissingCharacters {
    public ArrayList<Character> getListOfMissingCharacters(String inputString) {
        ArrayList<Character> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Correct String");
        String string = scan.nextLine().trim();
        char[] arr = string.toCharArray();
        char[] arr1 = inputString.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            if (arr[i] != arr1[i]) {
                list.add(arr1[i]);
            }
        }
        return list;

    }
}
