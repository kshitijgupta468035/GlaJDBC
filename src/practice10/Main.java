package practice10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ente the String ");
        String inputString = scan.nextLine().trim();
        MissingCharacters miss = new MissingCharacters();
        ArrayList<Character> list =  miss.getListOfMissingCharacters(inputString);
        System.out.println(list);
    }
}
