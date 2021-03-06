package lesson4.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HumanApplication {
    final static SimpleDateFormat HUMAN_FORMATION_DATE = new SimpleDateFormat("dd.MM.yyyy");

    public static void main(String[] args) throws ParseException {
        Human human = new Human();

        human.setFirstName("Ivan");
        human.setFirstName("");
        human.setFirstName("иваН");
        human.setFirstName("Иван");
        String firstName = human.getFirstName();

        human.setLastName("Ivanov");
        human.setLastName("");
        human.setLastName("Ив");
        human.setLastName("Иванов");
        String lastName = human.getLastName();

        human.setBirthDate(HUMAN_FORMATION_DATE.parse("12.12.2050"));
        String today = HUMAN_FORMATION_DATE.format(new Date());
        human.setBirthDate(HUMAN_FORMATION_DATE.parse(today));
        String anotherDay = HUMAN_FORMATION_DATE.format((new Date(new Date().getTime() + 99_999_999_999L)));
        human.setBirthDate(HUMAN_FORMATION_DATE.parse(anotherDay));
        human.setBirthDate(HUMAN_FORMATION_DATE.parse("24.08.1981"));
        Date birthDate = human.getBirthDate();

        try {
            human.setBirthDate(HUMAN_FORMATION_DATE.parse("0"));
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            human.setBirthDate(HUMAN_FORMATION_DATE.parse("2021-12-12"));
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(firstName + "\n" + lastName + "\n" + birthDate);
    }
}
