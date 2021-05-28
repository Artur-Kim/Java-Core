package lesson3.task5;

import java.util.Random;

public class Cat {
    String name;
    int age;

    public Cat() {
        name = Names.catName();
        age = new Random().nextInt(10) + 1;
    }
}