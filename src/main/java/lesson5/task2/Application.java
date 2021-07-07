package lesson5.task2;

public class Application {
    public static void main(String[] args) {
        Cat[] cats = new Cat[]
                {
                        new Cat("cat0", 5),
                        new Cat("cat1", 3),
                        null,
                        new Cat("cat3", 6),
                        new Cat("cat4", 1)
                };

        for (Cat currentCat : cats) {
            if (currentCat == null) {
                try {
                    System.out.printf("Имя: %s, Возраст: %d%n", currentCat.getName(), currentCat.getAge());
                } catch (NullPointerException exception) {
                    System.out.println("Возникла ошибка вывода информации: ссылка на null");
                    break;
                }
            }
        }
    }
}
