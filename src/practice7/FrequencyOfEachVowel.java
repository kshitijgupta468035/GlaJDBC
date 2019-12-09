package practice7;

import java.util.Scanner;

public class FrequencyOfEachVowel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String");
        String string = scan.nextLine().trim();
        string = string.toLowerCase();
        char[] arr = string.toCharArray();
        int a=0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 'a') {
                a = a + 1;
            }
            if (arr[i] == 'e') {
                b = b + 1;
            }
            if (arr[i] == 'i') {
                c = c + 1;
            }
            if (arr[i] == 'o') {
                d = d + 1;
            }
            if (arr[i] == 'u') {
                e = e + 1;
            }
        }
        System.out.println("Frequency of a: " + a);
        System.out.println("Frequency of e: " + b);
        System.out.println("Frequency of i: " + c);
        System.out.println("Frequency of o: " + d);
        System.out.println("Frequency of u: " + e);
    }
}
