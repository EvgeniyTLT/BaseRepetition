package lesson13;

public class MainTask1 {
    public static void main(String[] args) {
        User user1 = new User("AAA");
        User user2 = new User("BBB ");
        user1.sendMessage(user2, "Hello BBB");
        user1.sendMessage(user2, "How are you?");
        user2.sendMessage(user1, "Bay");
        user2.sendMessage(user1, "Not Bay");

        MessageDatabase.showDialog(user1, user2);

    }
}
