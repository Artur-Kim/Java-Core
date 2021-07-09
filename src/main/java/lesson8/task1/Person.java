package lesson8.task1;

import java.util.Objects;
import java.util.Random;

public class Person {
    private final String lastName;
    private final String firstName;

    public Person() {
        lastName = "Фамилия- " + (new Random().nextInt(20) + 1);
        firstName = "Имя- " + (new Random().nextInt(20) + 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(lastName, person.lastName) && Objects.equals(firstName, person.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName);
    }

    @Override
    public String toString() {
        return String.format("Фамилия: %s, Имя: %s", lastName, firstName);
    }
}
