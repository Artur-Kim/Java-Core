package lesson8.task3.terminals;

import lesson8.task3.FirmOwner;
import lesson8.task3.Terminal;

public class EleksnetTerminal extends Terminal {
    public EleksnetTerminal(String address) {
        super(address);
        firm = FirmOwner.ELEKSNET;
        tax = 11;
        noTaxLimit = 300;
    }
}