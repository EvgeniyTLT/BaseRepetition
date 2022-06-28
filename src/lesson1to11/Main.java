package lesson1to11;

public class Main {
    public static void main(String[] args) {
        long after = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 20001; i++) {
            stringBuilder.append(i+" ");
        }
        long before = System.currentTimeMillis();
        System.out.println(before - after);
        System.out.println(stringBuilder);
//        long after = System.currentTimeMillis();
//        String x = "";
//        for (int i = 0; i < 20001; i++) {
//            x = i + " ";
//            System.out.print(x);
//        }
//        long before = System.currentTimeMillis();
//        System.out.println(before - after);

    }
}
