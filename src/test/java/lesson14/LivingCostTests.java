package lesson14;

import lesson14.helpers.JsonHelper;
import lesson14.model.Account;
import lesson14.model.Person;
import lesson14.model.Property;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class LivingCostTests {
    private final List<Person> person = JsonHelper.getPersonsFromFile("src\\main\\java\\lesson14\\personFile.json");

    Function<List<Account>, Double> getSum = accounts -> {
        double[] sum = {0d};
        accounts.forEach(current -> sum[0] = sum[0] + current.getAccountBalance());
        return sum[0];
    };
    Function<List<Property>, Double> getSumOfLivingProperties = properties -> {
        final double[] sum = {0d};
        properties.forEach(current -> {
                    if (current.getType().equals("Жилая"))
                        sum[0] = sum[0] + current.getPrice();
                }
        );
        return sum[0];
    };

    @Test
    void accountSumLessThan2100000() {
        assert person != null;
        person.stream()
                .filter(p -> p.getAccounts().size() > 0)
                .filter(person1 -> getSum.apply(person1.getAccounts()) < 2_100_000)
                .forEach(person1 -> System.out.printf("%s %.2f\n", person1.getLastName(), getSum.apply(person1.getAccounts())));

    }

    @Test
    void maxPriceOfLivingProperty() {
        assert person != null;
        Optional<Person> persons = this.person.stream()
                .filter(person -> person.getProperties().size() > 0)
                .max((person1, person2) -> (int) (getSumOfLivingProperties.apply(person1.getProperties())
                        - getSumOfLivingProperties.apply(person2.getProperties())));

        System.out.printf("%s %s %s: %.2f%n", persons.get().getLastName(),
                persons.get().getFirstName(),
                persons.get().getPatronymic(),
                getSumOfLivingProperties.apply(persons.get().getProperties()));


    }
}
