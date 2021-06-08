package lesson5.task5;

import lesson5.task5.exceptions.*;

public class Passport {
    static Passport[] passports = new Passport[10];
    static int i = 0;

    String series;
    String number;

    public Passport(String series, String number) throws PassportIllegalArgumentException, NullPointerException, PassportAlreadyExistsException {
        if (series == null) throw new PassportSeriesNullPointerException();
        if (number == null) throw new PassportNumberNullPointerException();
        if (!series.matches("^\\d{2}\\d{2}$")) throw new PassportSeriesArgumentException();
        if (!number.matches("^\\d{6}$")) throw new PassportNumberArgumentException();
        for (Passport passport : passports) {
            if (passport == null) break;
            if (passport.series.equals(series) && passport.number.equals(number))
                throw new PassportAlreadyExistsException();
        }
        this.series = series;
        this.number = number;
        passports[i++] = this;
        System.out.printf("Паспорт с серией %s и номером %s успешно создан%n", series, number);
    }
}
