package lesson8.task3;

import lesson8.task3.terminals.EleksnetTerminal;
import lesson8.task3.terminals.QiwiTerminal;
import lesson8.task3.terminals.TinkoffTerminal;

import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Terminal> terminals = Arrays.asList(
                new QiwiTerminal("г. Москва, ул. Проходчиков, д.3"),
                new EleksnetTerminal("г. Москва, Измайловский пр-т, 73/2"),
                new EleksnetTerminal("г. Москва, ул. Бакунинская, д.1"),
                new EleksnetTerminal("г. Новосибирск, ул. Героев-Десантников, д. 4"),
                new TinkoffTerminal("г. Москва, Ленинградский пр-т, д. 15")
        );

        for (Terminal terminal : terminals) {
            terminal.pay("+7(901)000-00-01", 0);
            terminal.pay("+7(902)000-00-02", 100);
            terminal.pay("+7(903)000-00-03", 300);
            terminal.pay("+7(904)000-00-04", 500);
            terminal.pay("+7(905)000-00-05", 800);
            terminal.pay("+7(906)000-00-06", 1000);
            terminal.pay("+7(907)000-00-07", 1200);
            terminal.pay("+7(908)000-00-08", 1500);
            terminal.pay("+7(909)000-00-09", 2000);
            terminal.pay("+7(910)000-00-10", 5000);
        }
    }
}