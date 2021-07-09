package lesson8.task4;

import lesson8.task4.entities.*;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {


        List<Entity> entities = Arrays.asList(

                new User("Мария Рождёнова", "Диспетчер"),
                new User("Мария Рождёнова", "Диспетчер"),
                new User("Мария Рождёнова", "Менеджер"),
                new User("Ольга Петровна", "Менеджер"),

                new Account("Расчетный счет: ", "12345678998765432100"),
                new Account("Расчетный счет: ", "12345678998765432100"),
                new Account("Валютный счет: ", "12345678912345678900"),
                new Account("Кредитный счет: ", "12345678999999999999"),

                new Branch("Главный офис", "г. Москва"),
                new Branch("Главный офис", "г. Москва"),
                new Branch("Дополнительный офис", "г. Екатеринбург"),
                new Branch("Филиал", "г. Екатеринбург"),

                new Client("ООО Тинькофф", "г. Москва, ул. Пролетарская, д. 3"),
                new Client("ООО Тинькофф", "г. Москва, ул. Пролетарская, д. 3"),
                new Client("ООО Альфа-банк", "г. Москва, ул. Пушкина, д. 15"),
                new Client("ООО Сбербанк", "г. Москва, ул. Пушкина, д. 15")
        );

        for (Entity entity : entities)
            entity.validate();
    }

}