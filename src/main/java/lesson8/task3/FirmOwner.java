package lesson8.task3;

public enum FirmOwner {
    QIWI("ООО \"Киви\""),
    ELEKSNET("ООО \"Элекснет\""),
    TINKOFF("АО \"Тинькофф\"");

    private final String name;

    FirmOwner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
