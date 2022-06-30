package lesson13;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Tom");
        User user2 = new User("Dor");

        user1.subscribe(user2);
        user2.subscribe(user1);
        System.out.println(user1.isFriend(user2));







    }


}
