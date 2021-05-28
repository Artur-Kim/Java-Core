package lesson3.task5;

import java.util.Random;

public class Human {
    String name;
    Cat[] cats;
    Dog[] dogs;


    public Human() {
        name = Names.humanName();
        cats = new Cat[new Random().nextInt(3) + 1];
        dogs = new Dog[new Random().nextInt(3) + 1];

        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
        }
        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new Dog();
        }
    }
}
