import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] array = new int[x];
        for (int i = 0; i < x; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        for (int u : array) {
            
        }

    }

}
