package lesson6.task1;

public class Human {
    private final String lastName;
    private final String firstName;
    private final int age;
    private final String phone;

    public Human(String lastName, String firstName, int age, String phone) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.phone = phone;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }
}
