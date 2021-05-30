package lesson3.task4;


public class Human {

    String name;
    Human[] friends = new Human[10];

    Human(String name) {
        this.name = name;
    }

    public void addFriendsInArray(Human friendsIndex) {
        int countFriends = 0;
        while (friends[countFriends] != null) {
            if (friends[countFriends] == friendsIndex) {
                return;
            }
            countFriends++;
        }
        friends[countFriends] = friendsIndex;
        friendsIndex.addFriendsInArray(this);
    }
}