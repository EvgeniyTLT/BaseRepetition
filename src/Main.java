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
                max = u;
            }
        }
        System.out.println("max: " + max);
        int min = 10000;
        for (int u : array) {
            if (u < min) {
                min = u;
            }
        }
        System.out.println("min: " + min);
        int counter5 = 0;
        int sum5 = 0;
        for (int u : array) {
            if (u % 5 == 0) {
                counter5++;
                sum5 += u;
            }
        }
        System.out.println("counter5: " + counter5+ " sum5: " + sum5);

    }
}
