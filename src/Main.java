import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long after = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("PO");
        for (int i = 0; i < 1000000; i++) {
            stringBuilder.append("PO");
        }
        long before = System.currentTimeMillis();
        System.out.println(before-after);
        System.out.println(stringBuilder);
    }
}
