package lesson6.task1;

import java.util.Random;

public class PhoneGenerator {

    public static String generate() {
        return "+7" +
                "(" +
                threeRandomNumbers() +
                ")" +
                threeRandomNumbers() + "-" +
                twoRandomNumbers() + "-" +
                twoRandomNumbers();
    }

    static int threeRandomNumbers() {
        return new Random().nextInt(100) + 899;
    }

    static int twoRandomNumbers() {
        return new Random().nextInt(10) + 89;
    }
}
