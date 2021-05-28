package lesson3.task3;

public class HumanApplication {

    public static void main(String[] args) {

        Human valery = new Human("Валерий", 86, null, null);
        Human aleksandra = new Human("Александра", 72, null, null);
        Human ivan = new Human("Иван", 83, null, null);
        Human sergey = new Human("Сергей", 45, valery, aleksandra);
        Human marina = new Human("Марина", 38, ivan, null);
        Human vitaly = new Human("Виталий", 21, sergey, marina);
        Human elena = new Human("Елена", 17, sergey, marina);

        Human[] grandMothersFathers = new Human[4];
        int i = 0;
        for (Human currentParent : elena.parents) {
            for (Human currentGrand : currentParent.parents) {
                grandMothersFathers[i++] = currentGrand;
            }
        }
        for (Human currentGrand : grandMothersFathers) {
            if (currentGrand != null)
                System.out.println("Имя: " + currentGrand.name + " " + "(возраст " + currentGrand.age + ")");
        }
    }
}