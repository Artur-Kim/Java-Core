package lesson4.task3.workers;

public class ServiceDesk {

    private static int countTasks = 0;

    public static void createTask(String specification) {
        System.out.printf("Заявка %d была создана: %s%n", ++countTasks, specification);

        if (specification.matches("^.*((справк)|(отчет)|(бюджет)).*$")) {
            Accountant.takeTask(countTasks);

        } else if (specification.matches("^.*((доставк)|(курьер)).*$")) {
            Logistician.takeTask(countTasks);

        } else if (specification.matches("^.*((компьютер)|(сервер)|(принтер)).*$")) {
            SysAdmin.takeTask(countTasks);

        } else if (specification.matches("^.*(уборк).*$")) {
            Cleaner.takeTask(countTasks);

        } else
            notFoundSpecialist();
    }

    private static void notFoundSpecialist() {
        System.out.printf("Специалист по выполнению заявки %d не найден.%n", countTasks);
    }
}
