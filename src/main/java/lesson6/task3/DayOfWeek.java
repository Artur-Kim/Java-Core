package lesson6.task3;

public enum DayOfWeek {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота");

    private final String day;

    DayOfWeek(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

}