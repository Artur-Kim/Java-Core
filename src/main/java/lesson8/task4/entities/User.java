package lesson8.task4.entities;

import java.util.Objects;

public class User extends Entity {

    private final String jobTitle;

    public User(String name, String jobTitle) {
        super(name);
        this.jobTitle = jobTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(jobTitle, user.jobTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobTitle);
    }

    @Override
    public String toString() {
        return "User " + "[name: " + name + ", uuid: " + uuid + ", jobTitle: " + jobTitle + "]\n";
    }
}
