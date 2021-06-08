package lesson5.task2;

public class Application {
    public static void main(String[] args) {
        Cat[] cats = new Cat[]
                {       new Cat("cat0", 5),
                        new Cat("cat1", 3),
                        null,
                        new Cat("cat3", 6),
                        new Cat("cat4", 1)
                };

        for (Cat currentCat : cats) {
            if (currentCat == null) {
                try {
                    break;
                } catch (NullPointerException npe) {
                } finally {
                    System.out.println("Объект не может быть null.");
                }
            }
            System.out.printf("Имя: %s, Возраст: %d", currentCat.name, currentCat.age);
            System.out.println();
        }
    }
}
