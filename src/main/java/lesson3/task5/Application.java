package lesson3.task5;

public class Application {

    public static void main(String[] args) {
        Human[] humans = new Human[20];
        for (int i = 0; i < humans.length; i++) {
            humans[i] = new Human();
        }
        for (Human human1 : humans) {
            for (Human human2 : humans) {
                if (human1 != human2 && human1.cats.length == human2.cats.length && human1.dogs.length == human2.dogs.length) {
                    System.out.printf("Добрый день. Меня зовут %s, кошек у меня %d и собак %d %n", human2.name, human2.cats.length, human2.dogs.length);
                }
            }
        }
    }
}