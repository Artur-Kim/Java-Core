package lesson1.task1;

class CircleRadius {

    static double findRadius(int radius) {
        final double PI = 3.14;
        return radius * radius * PI;
    }

    public static void main(String[] args) {

        System.out.println(findRadius(0));
        System.out.println(findRadius(2));
        System.out.println(findRadius(100));
    }
}