package lesson4.task4;

public class Human {
    String firstName;
    String lastName;
    int age;
    Passport passport;

    public Human setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Human setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Human setAge(int age) {
        this.age = age;
        return this;
    }

    public Human setPassport(Passport passport) {
        if (passport == null) {
            System.out.println("Ошибка: null");
            return this;
        }
        if (passport.getNumber() != null && passport.getSeries() != null) {
            System.out.printf("Получен паспорт:%n серия: %s%n номер: %s%n для: %s %s%n", passport.getSeries(), passport.getNumber(), lastName, firstName);
            this.passport = passport;
        } else
            System.out.printf("Серия: %s номер: %s - невалидны.%n", passport.getSeries(), passport.getNumber());
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Passport getPassport() {
        return passport;
    }
}
