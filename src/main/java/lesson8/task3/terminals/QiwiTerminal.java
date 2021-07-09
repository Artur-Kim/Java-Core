package lesson8.task3.terminals;

import lesson8.task3.FirmOwner;
import lesson8.task3.Terminal;

public class QiwiTerminal extends Terminal {

    public QiwiTerminal(String address) {
        super(address);
        firm = FirmOwner.QIWI;
        tax = 7;
        noTaxLimit = 1000;
    }
}
