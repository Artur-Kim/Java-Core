package lesson1.task3;

class Numbers {
    static boolean isEvenInteger(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {

        System.out.println(isEvenInteger(14));
        System.out.println(isEvenInteger(19));
    }
}