package lesson2.task8;

import java.util.Scanner;

public class SwitchNumber {
    public static void main(String[] args) {
        System.out.println("Цикл с break");
        Scanner insertNumber = new Scanner(System.in);
        int number = insertNumber.nextInt();
        switch (number) {
            case 1:
                System.out.print("A");
                break;
            case 2:
                System.out.print("AA");
                break;
            case 3:
                System.out.print("AAA");
                break;
            case 4:
                System.out.println("AAAA");
                break;
            default:
                System.out.println("AAAAA");
                System.out.println();
        }
        System.out.println();
        System.out.println("Цикл без break");

        Scanner insertNumber2 = new Scanner(System.in);
        final int number2 = insertNumber2.nextInt();
        switch (number2) {
            default:
                System.out.print("A");
            case 4:
                System.out.print("A");
            case 3:
                System.out.print("A");
            case 2:
                System.out.print("A");
            case 1:
                System.out.print("A");
        }
    }
}
