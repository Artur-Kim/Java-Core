package lesson13.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class FuncMaxObject {
    @Test
    @DisplayName("максимальный объект: Integer")
    public void maxIntObjTest() {
        Assertions.assertEquals(204, Functions.maxObject.execute(Arrays.asList(5, 204, 17, 45)));

    }

    @Test
    @DisplayName("максимальный объект: Double")
    public void maxDoubleObjTest() {
        Assertions.assertEquals(204.0, Functions.maxObject.execute(Arrays.asList(5.0, 204.0, 17.0, 45.0)));
    }

    @Test
    @DisplayName("максимальный объект: список строк")

    public void maxStringObjTest() {
        Assertions.assertEquals("qwer", Functions.maxObject.execute(Arrays.asList("kfym", "qwer", "sebsss", "drjtdt")));
    }
}
