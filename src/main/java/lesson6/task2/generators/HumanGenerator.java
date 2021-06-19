package lesson6.task2.generators;

import lesson6.task2.Chance;
import lesson6.task2.Human;
import lesson6.task2.PhoneType;

import java.util.HashMap;
import java.util.Map;

public class HumanGenerator {
    public static Human generate() {
        String lastName = NameGenerator.generate();
        String firstName = NameGenerator.generate();
        int age = AgeGenerator.generate();
        Map<PhoneType, String> phones = new HashMap<>();

        for (int i = 0; i < PhoneType.values().length; i++) {
            if (Chance.calculateChance(20)) {
                PhoneType phoneType = PhoneType.values()[i];
                phones.put(phoneType, PhoneGenerator.generate());
            }
        }
        return new Human(lastName, firstName, age, phones);
    }
}
