package lesson1.task2;

class CheckRectangleSides {

    static boolean isSquareGreaterThanPerimeter(int height, int width) {
        int s = height * width;
        int p = (height + width) * 2;
        return s > p;
    }

    public static void main(String[] args) {

        System.out.println(isSquareGreaterThanPerimeter(2, 7));
        System.out.println(isSquareGreaterThanPerimeter(6, 5));
        System.out.println(isSquareGreaterThanPerimeter(6, 3));
    }
}