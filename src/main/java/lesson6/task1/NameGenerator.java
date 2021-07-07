package lesson6.task1;

import java.util.Random;

public class NameGenerator {

    public static String generate() {
        int nameLength = new Random().nextInt(4) + 8;
        String letters = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] newChar = letters.toCharArray();
        StringBuilder stringBuilder = new StringBuilder().append(Character.toUpperCase(newChar[new Random().nextInt(newChar.length)]));
        for (int i = 0; i < nameLength; i++) {
            stringBuilder.append(newChar[new Random().nextInt(newChar.length)]);
        }
        return stringBuilder.toString();
    }
}