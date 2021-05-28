package lesson2.task2;

public class ChessArray {

    public static void main(String[] args) {

        int[][] arrayAsChess = new int[8][8];
        // Если в цикле указать i < arrayAsChess.length, то программа сломается, если размер массива будет не квадратным (8х7)
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                // Здесь номер строки i складывается с номером столбца j и значение на пересечении должно выдавать остаток от деления на 2
                arrayAsChess[i][j] = (i + j) % 2;
            }
        }

        for (int i = 0; i < arrayAsChess.length; i++) {
            for (int j = 0; j < arrayAsChess.length; j++) {
                System.out.print(arrayAsChess[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for (int[] variableForString : arrayAsChess) {
            for (int variableForElement : variableForString)
                System.out.print(variableForElement);
            System.out.println();
        }
        System.out.println();

        int i = 0;

        while (i < arrayAsChess.length) {
            // Здесь переменная j обнуляется, чтобы новая строка начиналась с 0 значения.
            int j = 0;
            while (j < arrayAsChess.length) {
                System.out.print(arrayAsChess[i][j]);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}