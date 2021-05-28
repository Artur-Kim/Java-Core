package lesson2.task6;

import java.util.Random;

public class InvertedArrayWithStaticElement {

    public static void main(String[] args) {
        // .nextInt(указывает до какого числа  выводятся числа) + от какого числа (вдобавок поднимает верхнюю границу)
        // .nextInt(9); - от 0 до 8 / .nextInt(9) + 1; - от 1 до 9;
        int m = new Random().nextInt(3) + 3;
        int n = new Random().nextInt(3) + 3;

        int[][] mainArray = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mainArray[i][j] = new Random().nextInt(2);
            }
        }
        // Здесь создаются переменные, которые будут перебираться внутри mainArray, но вне верхней и нижней границы
        int k = new Random().nextInt(m - 2) + 1;
        int l = new Random().nextInt(n - 2) + 1;
        // Здесь присваивается случайному элементу индекса k и l значение 2
        mainArray[k][l] = 2;
        // Переменной i присваиваем значение от k, то есть 2
        // Переменнной j задаём значение случайного элемента + 1, чтобы не затрагивать элемент со значением 2
        for (int i = k + 1; i < m; i++) {
            for (int j = l + 1; j < n; j++) {
                mainArray[i][j] = new Random().nextInt();
                // Добавляем условие для инвертирования чисел, которые идут после 2
                if (mainArray[i][j] == 1) {
                    mainArray[i][j] = 0;
                } else {
                    mainArray[i][j] = 1;
                }
            }
        }
        System.out.println("Инвертированный массив");
        for (int[] line : mainArray) {
            for (int numbers : line)
                System.out.print(numbers + " ");
            System.out.println();
        }
    }
}

