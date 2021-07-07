package lesson4.task1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    private String firstName;
    private String lastName;
    private Date birthDate;

    public String getFirstName() {
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
        this.firstName = firstName;
        if (firstName.matches("^[А-Я][а-я]{2,}$")) {
            setAvailablePrint(firstName);
        } else {
            setUnavailablePrint(firstName);
        }
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
        if (lastName.matches("^[А-Я][а-я]{2,}$")) {
            setAvailablePrint(lastName);
        } else {
            setUnavailablePrint(lastName);
        }
    }


    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        Date currentDate = new Date();
        if (birthDate.before(currentDate)) {
            setAvailablePrint(new SimpleDateFormat("dd.MM.yyyy").format(birthDate));
        } else {
            setUnavailablePrint(new SimpleDateFormat("dd.MM.yyyy").format(birthDate));
        }
    }

    public void getPrint(String value) {
        System.out.printf("Начальный формат данных - %s%n", value);
        System.out.println();
    }

    public void setAvailablePrint(String value) {
        System.out.printf("Корректный формат данных - %s%n", value);
    }

    public void setUnavailablePrint(String value) {
        System.out.printf("Некорректный формат данных - %s%n", value);
    }
}

