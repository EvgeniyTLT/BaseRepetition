import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("1", 90);
        Player player2 = new Player("2", 90);
        Player player3 = new Player("3", 90);
        Player player4 = new Player("4", 90);
        Player player5 = new Player("5", 90);
        Player player6 = new Player("6", 90);
        Player player7 = new Player("7", 90);
        Player player8 = new Player("8", 90);
        System.out.println(Player.countPlayers);

        for (int i = 0; i < 100; i++) {
            player1.run();
        }
        System.out.println(Player.countPlayers);
    }
}
