package lesson2.task4;

import java.util.Arrays;

public class ThirdString {

    public static void main(String[] args) {

        String[] a = {"hello", "ping", "qwer", "post"};
        String[] b = {"world", "pong", "asdf", "get"};
        String[] c = {"", "", "", ""};

        for (int i = 0; i < a.length; i++) { // цикл, который будет проходить по каждому значению в массиве
            // Здесь мы меняем строку в массив из символов. (.toCharArray работает только для строк).
            char[] charArray = a[i].toCharArray(); // превращает "hello" в 'h','e','l','l','o'
            Arrays.sort(charArray); // импортируем класс import.java.util.Arrays, что позволяет сортировать массивы методом .sort(имя_массива) по алфавиту

            for (char newChar : charArray) { // Создаём цикл for-each, который, с помощью метода .valueOf(имя_переменной_цикла),
                String newString = String.valueOf(newChar); // преобразует переменную в нужный тип данных.
                // Условие, что цикл выполняется дальше, до первого совпадения символов в массивах "а" и "b".
                if (c[i].contains(newString))
                    continue;
                // Тут объявляется, что массив "b", по индексу, содержит символы из массива CharArray,
                // который изначально имеет значения из массива "a" по индексу, если нет, запускается цикл заново.
                if (b[i].contains(newString))  // Если совпадения есть, выходит на новую строчку ниже
                    c[i] += newString; // сюда передаём сразу два значения двух массивов.
            }
            System.out.println(c[i]);
        }
    }
}