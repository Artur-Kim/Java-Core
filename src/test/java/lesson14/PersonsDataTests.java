package lesson14;

import lesson14.helpers.JsonHelper;
import lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PersonsDataTests {
    private final List<Person> person = JsonHelper.getPersonsFromFile("src\\main\\java\\lesson14\\personFile.json");

    @Test
    void personWithNoPassportButThreeProperties() {
        assert person != null;
        long nullPassports = person.stream()
                .filter(o -> o.getPassport() == null).filter(o -> o.getProperties().size() == 3)
                .peek(o -> System.out.printf("%s %s %s\n", o.getLastName(), o.getFirstName(), o.getPatronymic()))
                .count();

        Assertions.assertEquals(3, nullPassports);
    }

    @Test
    void personWithAccountsNotEqualCardsAndLastNameEqualsVasiliev() {
        assert person != null;
        long count = person.stream()
                .filter(o -> o.getAccounts().size() != o.getCards().size())
                .filter(o -> "Васильев".equals(o.getLastName()))
                .peek(o -> System.out.printf("%s %s %s \n", o.getLastName(), o.getFirstName(), o.getPatronymic()))
                .count();

        Assertions.assertEquals(10, count);
    }


    @Test
    void personWithPassportSeriesStartsWith00() {
        assert person != null;
        long count = person.stream()
                .filter(o -> o.getPassport() != null)
                .filter(o -> o.getPassport().getSeries().startsWith("00"))
                .limit(5)
                .peek(o -> System.out.printf("%s %s %s %s %s \n", o.getLastName(), o.getFirstName(), o.getPatronymic(), o.getPassport().getSeries(), o.getPassport().getNumber()))
                .count();

        Assertions.assertEquals(5, count);
    }
}
