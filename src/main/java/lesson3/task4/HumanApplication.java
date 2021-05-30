package lesson3.task4;

public class HumanApplication {

    public static void main(String[] args) {

        Human sergey = new Human("Сергей");
        Human valeriy = new Human("Валерий");
        Human mikhail = new Human("Михаил");
        Human stanislav = new Human("Станислав");
        Human aleksandr = new Human("Александр");
        Human egor = new Human("Егор");
        Human grigoriy = new Human("Григорий");

        sergey.addFriendsInArray(valeriy);
        sergey.addFriendsInArray(valeriy);
        sergey.addFriendsInArray(grigoriy);
        mikhail.addFriendsInArray(stanislav);
        mikhail.addFriendsInArray(aleksandr);
        grigoriy.addFriendsInArray(egor);
        grigoriy.addFriendsInArray(aleksandr);
        aleksandr.addFriendsInArray(egor);
        stanislav.addFriendsInArray(valeriy);

        System.out.println(isFriends(sergey, grigoriy));
        System.out.println(isFriends(sergey, aleksandr));
        System.out.println(isFriends(stanislav, mikhail));
        System.out.println(isFriends(mikhail, valeriy));

    }

    static boolean isFriends(Human first, Human second) {
        for (Human firstFriend : first.friends) {
            if (firstFriend == second) {
                return true;
            }
        }
        return false;
    }
}