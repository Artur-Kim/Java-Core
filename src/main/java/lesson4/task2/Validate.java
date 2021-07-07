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

    public static Boolean areFieldsFilled(Human human) {
        Boolean isFieldsEmpty =
                human.getLastName() != null
                        && human.getFirstName() != null
                        && human.getBirthDate() != null;
        System.out.println(isFieldsEmpty ? "Все поля заполнены" : "Не все поля заполнены");
        return isFieldsEmpty;
    }

    public static Boolean fillingHumanArrayWithMessages(Human[] humans) {
        boolean checkingFillingTheArray = true;
        for (Human human : humans) {
            if (human == null) {
                checkingFillingTheArray = false;
                break;
            }
        }

        if (checkingFillingTheArray) {
            System.out.println("Ввод данных окончен");
        } else {
            System.out.println("Введите ещё данные: ");
        }
        return checkingFillingTheArray;
    }
}
