package lesson12.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import lesson12.task1.helpers.JsonHelper;
import lesson12.task1.model.House;

public class JsonSerializerTest {
    private final JsonHelper HELPER = new JsonHelper();
    private final String EXPECTED_RESULT_FILE_PATH = "src\\main\\java\\lesson12\\expected_json.txt";


    @Test
    @DisplayName("Проверка сериализации объекта")
    void serializationTest() throws IOException {
        House house = new House().generate();

        String actualHouseJson = HELPER.serialize(house);
        String expectedHouseJson = Files.readAllLines(Paths.get(EXPECTED_RESULT_FILE_PATH)).get(0);

        Assertions.assertEquals(expectedHouseJson, actualHouseJson);
    }
}