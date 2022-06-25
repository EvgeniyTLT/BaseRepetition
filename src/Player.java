public class Player {
    private String name;
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public Player(String name, int stamina) {
        this.name = name;
        this.stamina = stamina;
        if (countPlayers < 6) countPlayers++;
        else System.out.println("куда столько игроков? Игрок с именем: " + getName() + " не выходит на поле");
    }

    public int getStamina() {
        return stamina;
    }

    public String getName() {
        return name;
    }

    public void run() {
        if (stamina > 0) {
            stamina--;
            if (stamina == 0) {
                countPlayers--;
                System.out.println("Игрок " + getName() + " выбыл");
            }
        } else System.out.println("Игрок вне игры");
    }

    public static void info() {
        if (countPlayers == 6) System.out.println("На поле нет свободных мест");
        else System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
    }
}
