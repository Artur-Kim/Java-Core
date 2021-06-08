package lesson5.task5;

import lesson5.task5.exceptions.*;

public class Application {

    public static void main(String[] args) {
        newPassport("1234", "123456");
        newPassport("1234", "123 456");
        newPassport("12 34", "123456");
        newPassport("1234", "123456");
        newPassport("1234", null);
        newPassport(null, "123456");
        newPassport(null, null);
        newPassport("", "");
        newPassport("reqw", "123456");
    }

    static Passport newPassport(String series, String number) {
        try {
            return new Passport(series, number);
        } catch (
                         PassportSeriesArgumentException |
                        PassportNumberArgumentException |
                        PassportSeriesNullPointerException |
                        PassportNumberNullPointerException exception) {
            System.out.println("Введите верные значения серии и номера паспорта");
            return null;
        } catch (PassportAlreadyExistsException exception) {
            System.out.println("Данные серия и номер паспорта уже существуют");
            return null;
        }
    }
}