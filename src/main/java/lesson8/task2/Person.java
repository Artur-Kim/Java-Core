package lesson8.task2;

import java.util.Objects;
import java.util.Random;

public class Person {

    private final int birthDate;

    public Person() {
        birthDate = new Random().nextInt(365) + 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return birthDate == person.birthDate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(birthDate);
    }
}
