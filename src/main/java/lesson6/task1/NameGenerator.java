package lesson6.task1;

import java.util.Random;

public class NameGenerator {

    public static String generate() {
        int length = new Random().nextInt(4) + 8;
        String letters = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] c = letters.toCharArray();
        StringBuilder stringBuilder = new StringBuilder().append(Character.toUpperCase(c[new Random().nextInt(c.length)]));
        for (int i = 0; i < length; i++) {
            stringBuilder.append(c[new Random().nextInt(c.length)]);
        }
        return stringBuilder.toString();
    }
}