package lesson8.task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            people.add(new Person());
        }
        Set<Person> duplicates = new HashSet<>();
        for (int i = 0; i < people.size(); i++) {
            for (int j = i + 1; j < people.size(); j++) {
                Person first = people.get(i);
                Person second = people.get(j);
                if (first.equals(second)) duplicates.add(first);
            }
        }
        for (Person duplicate : duplicates) {
            System.out.println(duplicate);
        }
        Set<Person> setPeople = new HashSet<>();
        for (int i = 0; i < 2000; i++) {
            setPeople.add(new Person());
        }
        System.out.println("Количество элементов в данном множестве: " + setPeople.size());
    }
}
