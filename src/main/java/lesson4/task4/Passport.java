package lesson4.task4;

public class Passport {
    private String number;
    private String series;

    public Passport() {
        PassportStorage.addPassport(this);
    }

    public Passport setNumber(String number) {
        Passport result = this;
        if (PassportStorage.isPassportExist(series, number)) {
            if (number.matches("^[0-9]{6}$")) {
                setCorrectPrint(number);
                this.number = number;
            } else {
                setIncorrectPrint(number);
            }
        }
        return result;
    }

    public Passport setSeries(String series) {
        Passport result = this;
        if (PassportStorage.isPassportExist(series, number)) {
            if (series.matches("^[0-9]{4}$")) {
                setCorrectPrint(series);
                this.series = series;
            } else {
                setIncorrectPrint(series);
            }
        }
        return result;
    }

    public String getNumber() {
        return number;
    }

    public String getSeries() {
        return series;
    }

    private void setCorrectPrint(String value) {
        System.out.printf("Корректное значение: %s%n", value);
    }

    private void setIncorrectPrint(String value) {
        System.out.printf("Некорректное значение: %s%n", value);
    }
}
