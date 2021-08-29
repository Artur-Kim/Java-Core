package lesson13.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ModifiersTest {
    @Test
    @DisplayName("Тест взятия по модулю)")
    public void absolutModifierTest() {
        Assertions.assertEquals(5, Modifiers.absolute.modify(-5));
        Assertions.assertEquals(Integer.MAX_VALUE, Modifiers.absolute.modify(Integer.MIN_VALUE + 1));
    }

    @Test
    @DisplayName("Тест инвертирования")
    public void invertModifierTest() {
        Assertions.assertFalse(Modifiers.invert.modify(true));
        Assertions.assertTrue(Modifiers.invert.modify(false));
        Assertions.assertEquals(false, Modifiers.invert.modify(true));
    }


    @Test
    @DisplayName("Тест на переворачивание строки в обратном порядке)")
    public void reversStringModifierTest() {
        Assertions.assertEquals("Пикник", Modifiers.reverse.modify("кинкиП"));
    }
}
