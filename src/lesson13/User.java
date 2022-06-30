package lesson13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<User> subscriptions) {
        this.subscriptions = subscriptions;
    }

    @Override
    public String toString() {
        return
                "username:" + username;
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        for (User u : this.subscriptions) {
            if (u.getUsername().equals(user.getUsername())) {
                return true;
            }
            return false;
        }

        public boolean isFriend (User user){
            if (isSubscribed(user) && user.isSubscribed(this)) {
                return true;
            }
            return false;
        }

        public void sendMessage (User user, String text){
            MessageDatabase.sendMessage(this, user, text);
        }


    }
