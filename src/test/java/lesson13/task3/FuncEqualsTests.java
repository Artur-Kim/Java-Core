package lesson13.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FuncEqualsTests {

    @Test
    @DisplayName("Все ли объекты эквививаленты: все эквиваленты")

    public void equalObjTest() {
        Object object1 = new Object();
        List<Object> equalObjects = Arrays.asList(object1, object1);
        Assertions.assertTrue(Functions.onlyEquals.execute(equalObjects));
    }

    @Test
    @DisplayName("Все ли объекты эквививаленты: не все эквиваленты")

    public void notEqualObjTest() {
        Object object1 = new Object();
        Object object5 = new Object();
        List<Object> notEqualObjects = Arrays.asList(object1, object5);
        Assertions.assertFalse(Functions.onlyEquals.execute(notEqualObjects));
    }

    @Test
    @DisplayName("Все ли объекты эквививаленты: пустой список")

    public void zeroListObjTest() {
        List<Object> zeroList = Collections.emptyList();
        Assertions.assertTrue(Functions.onlyEquals.execute(zeroList));
        Assertions.assertTrue(Functions.onlyEquals.execute(Collections.EMPTY_LIST));
    }
}

