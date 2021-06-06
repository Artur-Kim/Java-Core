package lesson5.task1;

import java.util.Random;

public class DivideMatrix {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        int m = new Random().nextInt(5) + 5;
        int n = new Random().nextInt(5) + 5;

        int[] dividends = new int[m];
        int[] dividers = new int[n];
        int[][] result = new int[n][m];

        for (int i = 0; i < m; i++) {
            dividends[i] = new Random().nextInt(5) + 4;
        }
        for (int j = 0; j < n; j++) {
            dividers[j] = new Random().nextInt(3);
        }
        for (int k = 0; k < m; k++) {
            for (int l = 0; l < n; l++) {
                try {
                    result[l][k] = dividends[k] / dividers[l];
                } catch (ArithmeticException exc) {
                    result[l][k] = -1;
                }
            }
        }
        System.out.println("Массив делимых чисел:");
        for (int dividend : dividends)
            System.out.print(dividend + " ");
        System.out.println();

        System.out.println("Массив чисел делителей:");
        for (int divider : dividers)
            System.out.print(divider + " ");
        System.out.println();

        System.out.println("Результат:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[j][i] + " ");
            }
            System.out.println();
        }
    }
}