package lesson4.task2;

public class Validate {

    public static Boolean checkSpaces(String string) {
        Boolean stringIsValid = string.matches("^\\S*\\s\\S*\\s\\S*$");
        if (stringIsValid) {
            System.out.println("Строка валидна");
        } else {
            System.out.println("Строка невалидна");
        }
        return stringIsValid;
    }

    public static String[] arrayString(String string) {
        return string.split(" ");
    }

    public static Boolean validHuman(Human human) {
        Boolean validHuman =
                        human.getLastName() != null
                        && human.getFirstName() != null
                        && human.getBirthDate() != null;
        System.out.println(validHuman ? "Все поля заполнены" : "Не все поля заполнены");
        return validHuman;
    }

    public static Boolean humanArray(Human[] humans) {
        boolean inputMessage = true;
        for (Human human : humans) {
            if (human == null) {
                inputMessage = false;
                break;
            }
        }

        if (inputMessage) {
            System.out.println("Ввод данных окончен");
        } else {
            System.out.println("Введите ещё данные: ");
        }
        return inputMessage;
    }
}
