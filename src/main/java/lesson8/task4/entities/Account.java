package lesson8.task4.entities;

import java.util.Objects;

public class Account extends Entity {

    private final String accountNumber;

    public Account(String name, String accountNumber) {
        super(name);
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountNumber, account.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }

    @Override
    public String toString() {
        return "Account " + "[name: " + name + ", uuid: " + uuid + ", uuid: " + uuid + "]\n";
    }
}
