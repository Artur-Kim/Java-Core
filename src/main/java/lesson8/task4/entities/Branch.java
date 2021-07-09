package lesson8.task4.entities;

import java.util.Objects;

public class Branch extends Entity {

    private final String address;

    public Branch(String name, String address) {
        super(name);
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Branch branch = (Branch) o;
        return Objects.equals(address, branch.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }

    @Override
    public String toString() {
        return "Branch " + "[name: " + name + ", uuid: " + uuid + ", uuid: " + uuid + "]\n";
    }
}
