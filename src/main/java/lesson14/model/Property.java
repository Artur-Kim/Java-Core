package lesson14.model;

public class Property {
    private String type;
    private String address;
    private double price;

    public Property() {
    }

    public Property(String type, String address, double price) {
        this.type = type;
        this.address = address;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Property{" +
                "type='" + type + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
