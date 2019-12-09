package practice1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RandomArrayClass random = new RandomArrayClass();
        int length = scan.nextInt();
        random.length = length;
        int[] array = new int[length];
        int [] array2 = random.populatePseudorandomElementsInArray(array);
        System.out.println(Arrays.toString(array2));

    }
}
