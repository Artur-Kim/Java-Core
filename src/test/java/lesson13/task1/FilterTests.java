package lesson13.task1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class FilterTests {
    @Test
    @DisplayName("фильтрует, оставляя значения, которые меньше 5")

    public void testFilterLessThan5() {
        List<Integer> list1 = Arrays.asList(-20, 0, 4, 5, 7, 9);
        Filter filter = value -> value < 5;
        List<Integer> filteredList1 = FilterHelper.filterable(list1, filter);
        Assertions.assertEquals(Arrays.asList(-20, 0, 4), filteredList1);


    }

    @Test
    @DisplayName("фильтрует, оставляя значения, которые больше 10")
    public void testFilterBiggerThan10() {
        List<Integer> list1 = Arrays.asList(-20, 0, 4, 5, 7, 9, 10, 15, 25);
        Filter filter = value -> value > 10;
        List<Integer> filteredList1 = FilterHelper.filterable(list1, filter);
        Assertions.assertEquals(Arrays.asList(15, 25), filteredList1);
    }


    @Test
    @DisplayName("фильтрует, оставляя значения, содержащиеся в списке (-20, 4, 9, 12, 15)")
    public void testFilter() {
        List<Integer> list1 = Arrays.asList(-20, 0, 4, 5, 7, 9, 10, 15, 25);
        Filter filter = value -> (value == -20) || (value == 4) || (value == 9) || (value == 15);
        List<Integer> filteredList1 = FilterHelper.filterable(list1, filter);
        Assertions.assertEquals(Arrays.asList(-20, 4, 9, 15), filteredList1);
    }

    @Test
    @DisplayName("фильтрует, оставляя только значения, которые в списке не повторяются")
    public void testFilterNotRepeatedValue() {
        List<Integer> list1 = Arrays.asList(-10, -7, 5, 15, 5, -2, 4, 15);
        Filter filter = value -> list1.indexOf(value) == list1.lastIndexOf(value);
        List<Integer> filteredList1 = FilterHelper.filterable(list1, filter);
        Assertions.assertEquals(Arrays.asList(-10, -7, -2, 4), filteredList1);
    }
}
