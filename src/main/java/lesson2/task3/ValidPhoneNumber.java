package lesson2.task3;

public class ValidPhoneNumber {
    public static void main(String[] args) {

        String[] numbers = {"+7(910)423-73-12", "7(910)423-73-12", "89215310934", "+5(911)310-12-74", "+7(9fg)125-42-99", "+7(122)2342343"};
        ValidPhoneNumber validNumbers = new ValidPhoneNumber();

        // Здесь создаётся цикл, который берёт значения в массиве выше и для каждого значения проверяет условие из цикла и регулярного выражения.
        for (String takeNumber : numbers) {
            System.out.println(validNumbers.doesNumberMatch(takeNumber) && validNumbers.checkNumber(takeNumber));

        }
    }


    boolean checkNumber(String compliance) {
        return compliance.matches("^\\+7\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$");
    }

    boolean doesNumberMatch(String verify) {
        if (!verify.startsWith("+7(")) {
            return false;
        }
        if (verify.charAt(6) != ')') {
            return false;
        }

        if (verify.length() != 16) {
            return false;
        }
        if (verify.charAt(10) != '-' && verify.charAt(13) != '-') {
            return false;
        }

        // Здесь мы определяем, какие индексы из элементов массива могут изменяться.
        int[] changed = {3, 4, 5, 7, 8, 9, 11, 12, 14, 15};
        for (int index : changed) {
            // Метод Character.isDigit - определяет, является ли указанное значение char цифрой
            if (!Character.isDigit(verify.charAt(index)))
                return false; // Здесь указываем, какие значения из массива должны проверяться
        }
        return true;
    }
}