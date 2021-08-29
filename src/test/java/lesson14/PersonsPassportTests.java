package lesson14;

import lesson14.helpers.JsonHelper;
import lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.NoSuchElementException;

public class PersonsPassportTests {
    private final List<Person> person = JsonHelper.getPersonsFromFile("src\\main\\java\\lesson14\\personFile.json");

    @Test
    void personWithPassportSeriesStartsWith00Desc() {
        assert person != null;
        long count = person.stream()
                .filter(o -> o.getPassport() != null)
                .filter(o -> o.getPassport().getSeries().startsWith("00"))
                .sorted((o1, o2) -> o2.getPassport().getNumber().compareTo(o1.getPassport().getNumber()))
                .peek(o -> System.out.printf("%s %s %s %s %s \n", o.getLastName(), o.getFirstName(), o.getPatronymic(), o.getPassport().getSeries(), o.getPassport().getNumber()))
                .count();
        Assertions.assertEquals(6, count);
    }

    @Test
    void personWithPassportSeriesEqualsNumber() {
        assert person != null;
        Person person = this.person.stream()
                .filter(o -> o.getPassport() != null)
                .filter(o -> o.getPassport().getNumber().substring(2).equals(o.getPassport().getSeries()))
                .findFirst()
                .orElseThrow(NoSuchElementException::new);

        System.out.printf("%s %s %s %s %s \n", person.getLastName(), person.getFirstName(), person.getPatronymic(), person.getPassport().getSeries(), person.getPassport().getNumber());


    }

}
