package lesson4.task4;

public class Application {
    public static void main(String[] args) {

        Passport correct = new Passport().setSeries("1234").setNumber("123456");
        Passport duplicate = new Passport().setSeries("1234").setNumber("123456");
        Passport incorrect = new Passport().setSeries("999").setNumber("999999999");
        Passport incorrect2 = new Passport().setSeries("ыпфыф").setNumber("252551");
        Passport incorrect3 = new Passport().setSeries("0000").setNumber("");

        Passport nullPassport = new Passport();
        System.out.printf("Passport is null: %s %s%n", nullPassport.getSeries(), nullPassport.getNumber());

        Passport seriesPassport = new Passport().setSeries("4321");
        Passport numberPassport = new Passport().setNumber("654321");

        Human human = new Human().setAge(25).setFirstName("Иван").setLastName("Иванов").setPassport(correct);
        Human human2 = new Human().setAge(25).setFirstName("Сергей").setLastName("Фомичев").setPassport(duplicate);

        human.setPassport(numberPassport).setPassport(seriesPassport);
        human2.setPassport(numberPassport).setPassport(seriesPassport);


    }
}
