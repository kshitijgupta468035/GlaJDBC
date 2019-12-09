package practice3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter true to On AC or false");
        boolean ac = scan.nextBoolean();
        System.out.println("Enter true to On AC or false");
        boolean homeTheatre = scan.nextBoolean();
        System.out.println("Enter true to On AC or false");
        boolean fan = scan.nextBoolean();
        System.out.println("Enter true to On AC or false");
        boolean light = scan.nextBoolean();
        Room room = new Room(ac, homeTheatre, fan, light);
        boolean overload = room.overloadCondition();
        if (overload == true) {
            System.out.println("Overload");
        } else {
            System.out.println("Not Overload");
        }

    }
}
