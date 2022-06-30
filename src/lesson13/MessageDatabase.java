package lesson13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void sendMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message u : messages
        ) {
            if (u.getSender() == u1 && u.getReceiver() == u2 ||
                    u.getSender() == u2 && u.getReceiver() == u1) {
                System.out.println(u.getSender() + ": " + u.getText());
            }
        }
    }

}
