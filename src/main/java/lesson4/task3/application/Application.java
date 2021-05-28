package lesson4.task3.application;

import lesson4.task3.workers.ServiceDesk;

public class Application {
    public static void main(String[] args) {
        String[] serviceTasks = {
                "Прошу предоставить справку 2-ндфл за текущий год.",
                "Прошу предоставить курьера 2 сентября 2020 года.",
                "Необходимо починить принтер в комнате 207.",
                "Прошу произвести внеплановую уборку в переговорной №1.",
                "Прошу выдать канцелярские принадлежности сотруднику Баранову А.С."
        };
        for (String serviceTask : serviceTasks) {
            ServiceDesk.createTask(serviceTask);
            System.out.println();
        }
    }
}

