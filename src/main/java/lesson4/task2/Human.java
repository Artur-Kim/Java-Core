package lesson4.task2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    static String firstName;
    static String lastName;
    static Date birthDate;

    public String getFirstName() {
        final String firstName = Human.firstName;
        getPrint(firstName);
        return firstName;
    }

    public String getLastName() {
        getPrint(lastName);
        return lastName;
    }

    public Date getBirthDate() {
        String date = birthDate != null
                ? new SimpleDateFormat("dd.MM.yyyy").format(birthDate)
                : null;
        getPrint(date);
        return birthDate;
    }

    public void setFirstName(String firstName) {
        Human.firstName = firstName;
        if (firstName.matches("^[А-Я][а-я]{2,}$")) {
            setAviablePrint(firstName);
        } else {
            setUnviablePrint(firstName);
        }
    }


    public void setLastName(String lastName) {
        Human.lastName = lastName;
        if (lastName.matches("^[А-Я][а-я]{2,}$")) {
            setAviablePrint(lastName);
        } else {
            setUnviablePrint(lastName);
        }
    }


    public void setBirthDate(Date birthDate) {
        Human.birthDate = birthDate;
        Date currentDate = new Date();
        if (birthDate.before(currentDate)) {
            setAviablePrint(new SimpleDateFormat("dd.MM.yyyy").format(birthDate));
        } else {
            setUnviablePrint(new SimpleDateFormat("dd.MM.yyyy").format(birthDate));
        }
    }

    public void getPrint(String value) {
        System.out.printf("Начальный формат данных - %s", value);
        System.out.println();
    }

    public void setAviablePrint(String value) {
        System.out.printf("Корректный формат данных - %s%n", value);
    }

    public void setUnviablePrint(String value) {
        System.out.printf("Некорректный формат данных - %s%n", value);
    }
}