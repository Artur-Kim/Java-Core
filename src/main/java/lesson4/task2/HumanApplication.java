package lesson4.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class HumanApplication {
    static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");

    public static void main(String[] args) throws ParseException, IOException {
        Human[] humans = new Human[2];
        int i = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Введите строку в формате [Имя Фамилия Дата рождения]:");
            String input = reader.readLine();

            boolean inputValid = Validate.checkSpaces(input);
            if (!inputValid) continue;

            String[] humanFields = Validate.arrayString(input);
            Human human = new Human();
            human.setLastName(humanFields[0]);
            human.setFirstName(humanFields[1]);
            human.setBirthDate(DATE_FORMAT.parse(humanFields[2]));

            boolean isHumanValid = Validate.areFieldsFilled(human);
            if (!isHumanValid) continue;

            humans[i++] = human;

            boolean isArrayFull = Validate.fillingHumanArrayWithMessages(humans);
            if (isArrayFull) break;
        }
    }
}
