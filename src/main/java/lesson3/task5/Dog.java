package lesson3.task5;

import java.util.Random;

public class Dog {
    String name;
    int age;

    public Dog() {
        name = Names.dogName();
        age = new Random().nextInt(10) + 1;
    }
}
