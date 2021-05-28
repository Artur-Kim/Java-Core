package lesson2.task7;

import java.util.Scanner;

public class AgeScanning {
    public static void main(String[] args) {
        Scanner ageScan = new Scanner(System.in);
        int age = ageScan.nextInt();
        if (age >= 25 && age < 44) {
            System.out.println("Young age");
        } else if (age >= 44 && age < 60) {
            System.out.println("Middle age");
        } else if (age >= 60 && age < 75) {
            System.out.println("Old age");
        } else if (age >= 75 && age < 90) {
            System.out.println("Elder age");
        } else {
            System.out.println("Unknown age");
        }
    }
}
