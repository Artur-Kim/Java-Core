package lesson3.task3;

public class Human {

    String name;
    int age;
    Human[] parents;

    Human(String name, int age, Human father, Human mother) {
        this.name = name;
        this.age = age;
        this.parents = new Human[]{father, mother};
    }
}
