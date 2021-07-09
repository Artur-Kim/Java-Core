package lesson8.task4.entities;

import java.util.Objects;

public class Client extends Entity {

    private final String address;

    public Client(String name, String address) {
        super(name);
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(address, client.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }

    @Override
    public String toString() {
        return "Client " + "[name: " + name + ", uuid: " + uuid + ", uuid: " + uuid + "]\n";
    }
}