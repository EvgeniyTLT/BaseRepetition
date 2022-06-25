import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        int max = 0;
        for (int u : array) {
            if (u > max) {
                max=u;
            }

        }
        System.out.println(max);
    }

}
