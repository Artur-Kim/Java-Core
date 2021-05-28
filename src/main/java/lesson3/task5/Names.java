package lesson3.task5;

import java.util.Random;

public class Names {

    final static String[] HUMAN_NAMES = {"Петя", "Егор", "Степа", "Артем", "Иван", "Максим"};
    final static String[] CAT_NAMES = {"Мурзик", "Матроскин", "Симба", "Феликс", "Куки", "Кэт"};
    final static String[] DOG_NAMES = {"Барон", "Вольт", "Мухта", "Рекс", "Оскар", "Пайк"};

    static String humanName() {
        return HUMAN_NAMES[new Random().nextInt(HUMAN_NAMES.length)];
    }

    static String catName() {
        return CAT_NAMES[new Random().nextInt(CAT_NAMES.length)];
    }

    static String dogName() {
        return DOG_NAMES[new Random().nextInt(DOG_NAMES.length)];
    }
}
