package lesson13.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FuncSumTests {
    @Test
    @DisplayName("вычислять сумму чисел в списке: положительные числа")

    public void positiveIntSumTest() {
        List<Integer> positiveIntegers = Arrays.asList(1, 2, 3, 4);
        Assertions.assertEquals(10, Functions.sumFunction.execute(positiveIntegers));
    }

    @Test
    @DisplayName("вычислять сумму чисел в списке: отриц. числа")

    public void negativeIntSumTest() {
        List<Integer> positiveIntegers = Arrays.asList(-1, -2, -3, -4);
        Assertions.assertEquals(-10, Functions.sumFunction.execute(positiveIntegers));
    }
}
