package lesson2.task5;

import java.util.Random;

public class IntegerNumberArray {

    public static void main(String[] args) {
        // .nextInt(указывает до какого числа  выводятся числа) + от какого числа (вдобавок поднимает верхнюю границу)
        // .nextInt(9); - от 0 до 8 / .nextInt(9) + 1; - от 1 до 9;
        // Math.random() - тип double. по этому приводится к типу int
        // Класс Math генерирует число от 0 до 1 и оно умножается на 10, например значения 0.5/0.8/0.3 - станут 5/8/3.
        int m = new Random().nextInt(3) + 3;
        int n = new Random().nextInt(3) + 3;

        int[][] firstArray = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                firstArray[i][j] = (int) (10 * Math.random());
            }
        }
        System.out.println("Первый массив");
        for (int[] line : firstArray) {
            for (int numbers : line)
                System.out.print(numbers + " ");
            System.out.println();
        }
        System.out.println();
        System.out.println("Второй массив");

        int[][] secondArray = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                secondArray[i][j] = firstArray[j][i];
                System.out.print(secondArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
