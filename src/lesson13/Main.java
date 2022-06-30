package lesson13;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Tom");
        User user2 = new User("Dor");

        Message message1 = new Message(user1, user2, "Hi");
        System.out.println(message1.toString());
    }
}
