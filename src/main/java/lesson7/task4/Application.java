package lesson7.task4;

import lesson7.task4.credits.AnnuityCredit;
import lesson7.task4.credits.BaseCredit;
import lesson7.task4.credits.DifferentiateCredit;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        double amount = 300_000d;
        double rate = 16.9d;
        int duration = 12;

        BaseCredit baseCredit = new BaseCredit(amount, rate, duration);
        BaseCredit differentiate = new DifferentiateCredit(amount, rate, duration);
        BaseCredit annuity = new AnnuityCredit(amount, rate, duration);

        List<Double> basePayments = baseCredit.getMonthPayments();
        List<Double> diffPayments = differentiate.getMonthPayments();
        List<Double> annuityPayments = annuity.getMonthPayments();

        for (int i = 0; i < annuityPayments.size(); i++) {
            System.out.printf("%d %.2f %.2f %.2f%n", i + 1, basePayments.get(i),
                    diffPayments.get(i), annuityPayments.get(i));
        }
        System.out.printf("Переплата составляет:%n %.2f  %.2f  %.2f",
                baseCredit.calculateOverpayment(), differentiate.calculateOverpayment(), annuity.calculateOverpayment());


    }
}