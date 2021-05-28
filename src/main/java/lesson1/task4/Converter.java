package lesson1.task4;

class Converter {
    static int centimetersToMeters(int sm) {
        return sm / 100;
    }

    public static void main(String[] args) {

        System.out.println(centimetersToMeters(115));
        System.out.println(centimetersToMeters(800));
        System.out.println(centimetersToMeters(278));
    }
}