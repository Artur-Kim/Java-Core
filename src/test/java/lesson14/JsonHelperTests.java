package lesson14;

import lesson14.helpers.JsonHelper;
import lesson14.model.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

public class JsonHelperTests {

    @Test
    public void getPersonsFromFileTest() {
        List<Person> persons = JsonHelper.getPersonsFromFile("src\\main\\java\\lesson14\\personFile.json");
        System.out.println();
    }
}
