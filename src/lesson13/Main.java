package lesson13;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("AAA");
        User user2 = new User("BBB");
        user1.sendMessage(user2, "Hello my friend");
        user2.sendMessage(user1, "Hello my  not friend");



        MessageDatabase.showDialog(user1, user2);

    }
}
