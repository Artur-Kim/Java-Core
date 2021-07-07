package lesson4.task4;

public class PassportStorage {
    static Passport[] passport = new Passport[10];
    static int i = 0;

    public static boolean isPassportExist(String series, String number) {
        for (Passport passport : passport) {
            if (passport == null)
                break;
            String currentSeries = passport.getSeries();
            String currentNumber = passport.getNumber();
            if (currentSeries == null || currentNumber == null)
                continue;
            if (currentSeries.equals(series) && currentNumber.equals(number)) {
                System.out.printf("Паспорт серия: %s номер: %s уже существует.%n", series, number);
                return false;
            }
        }
        return true;
    }

    public static void addPassport(Passport passport) {
        PassportStorage.passport[i++] = passport;
    }
}