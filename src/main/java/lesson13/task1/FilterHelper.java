package lesson13.task1;

import java.util.ArrayList;
import java.util.List;

public class FilterHelper {

    public static List<Integer> filterable(List<Integer> inputList, Filter filter) {
        List<Integer> outputList = new ArrayList<>();
        for (Integer integer : inputList) {
            if (filter.filter(integer)) {
                outputList.add(integer);
            }
        }
        return outputList;
    }
}
