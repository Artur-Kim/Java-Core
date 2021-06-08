package lesson5.task3;

import java.util.Random;

public class IterationDivide {
    public static void main(String[] args) {
        int m;
        int n;
        int total = new Random().nextInt(500) + 500;
        int errCount = 0;

        for (int i = 0; i < total; i++) {
            m = new Random().nextInt(4);
            n = new Random().nextInt(4);
            try {
                int divide = m / n;
            } catch (ArithmeticException ae) {
                errCount++;
            }
        }
        System.out.printf("Из %d операций деления %d было выполнено с ошибкой.", total, errCount);
    }
}
