package lesson3.task1;

public class CalculatorApplication {

    public static void main(String[] args) {

        int sum = Calculator.calculateSum(4, 2);
        System.out.println(sum);

        int sub = Calculator.subtract(5, 3);
        System.out.println(sub);

        int mul = Calculator.multiply(2, 6);
        System.out.println(mul);

        double div = Calculator.divide(5, 3);
        System.out.println(div);
    }
}
