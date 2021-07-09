package lesson8.task3.terminals;

import lesson8.task3.FirmOwner;
import lesson8.task3.Terminal;

public class TinkoffTerminal extends Terminal {

    private final double minAmount;

    public TinkoffTerminal(String terminalAddress) {
        super(terminalAddress);
        firm = FirmOwner.TINKOFF;
        tax = 9;
        noTaxLimit = 600;
        minAmount = 100;
    }

    @Override
    public void pay(String phone, double amount) {
        if (amount >= minAmount) {
            super.pay(phone, amount);
        } else {
            System.out.printf("Минимальния сумма для пополнения %.2f.%n", minAmount);
        }
    }
}
