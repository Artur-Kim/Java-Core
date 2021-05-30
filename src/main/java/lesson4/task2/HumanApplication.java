package lesson4.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class HumanApplication {
    static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    public static void main(String[] args) throws ParseException, IOException {
        Human[] humans = new Human[2];
        int i = 0;

        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите строку в формате [Имя Фамилия Дата рождения]:");
            String input = reader.readLine();

            boolean inputValid = Validate.checkSpaces(input);
            if (!inputValid) continue;

            String[] humanFields = Validate.arrayString(input);
            Human human = new Human();
            human.setLastName(humanFields[0]);
            human.setFirstName(humanFields[1]);
            human.setBirthDate(dateFormat.parse(humanFields[2]));

            boolean isHumanValid = Validate.validHuman(human);
            if (!isHumanValid) continue;

            humans[i++] = human;

            boolean isArrayFull = Validate.humanArray(humans);
            if (isArrayFull) break;
        }
    }
}
