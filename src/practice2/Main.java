package practice2;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number = scan.nextDouble();
        Number num = new Number(number);

        System.out.println(num.isZero() + " " +  num.isPositive() + " " +  num.isNegative() + " " + num.isOdd() + " " + num.isEven()  + num.isPrime() + num.isArmstrong());

        System.out.println( num.getFactorial());
        System.out.println(num.getNumber());
        System.out.println(num.getReverse());
        System.out.println(num.getSqr());
        System.out.println(num.sumDigits());

        num.listFactor();
        num.dispBinary();



    }

}
