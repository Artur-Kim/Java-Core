package lesson14;

import lesson14.helpers.JsonHelper;
import lesson14.model.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ValidationAndAccountTests {
    private final List<Person> person = JsonHelper.getPersonsFromFile("src\\main\\java\\lesson14\\personFile.json");

    @Test
    void differentPassportSeries() {
        assert person != null;
        long count = person.stream()
                .filter(o -> o.getPassport() != null)
                .map(o -> o.getPassport().getSeries())
                .distinct()
                .count();
        System.out.printf("Количество различных серий паспортов: %s", count);
    }

    @Test
    void choose3AccountsAnd2CardsFrom50To99() {

        assert person != null;
        Person p = person.stream()
                .filter(o -> o.getPassport() != null)
                .limit(99)
                .skip(49)
                .filter(o -> (o.getAccounts().size() == 3 && o.getCards().size() == 2))
                .findFirst()
                .orElseGet(() -> person.get(0));

        System.out.printf("%s %s %s\n " +
                        "%s, %s, %s\n " +
                        "%s, %s\n", p.getFirstName(), p.getLastName(), p.getPatronymic(),
                p.getAccounts().get(0).getAccountNumber(),
                p.getAccounts().get(1).getAccountNumber(),
                p.getAccounts().get(2).getAccountNumber(),
                p.getCards().get(0).getCardNumber(),
                p.getCards().get(1).getCardNumber());
    }

    @Test
    void PassportValidation() {
        assert person != null;
        boolean validationOK = person.stream()
                .filter(o -> o.getPassport() != null)
                .allMatch(o -> o.getPassport().getSeries().matches("\\d{4}") && o.getPassport().getNumber().matches("\\d{6}"));
        String output = validationOK
                ? "У всех клиентов, у которых есть паспорт, данные соответствуют формату"
                : "Есть клиенты, у которых данные паспорта не соответствуют формату";
        System.out.println(output);
    }
}
