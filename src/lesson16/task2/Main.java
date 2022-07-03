package lesson16.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        File file1 = new File("file1.txt");
        PrintWriter printWriter1 = new PrintWriter(file1);
        for (int i = 0; i < 1000; i++) {
            printWriter1.println(random.nextInt(100));
        }
        printWriter1.close();
        File file2 = new File("file2.txt");
        PrintWriter printWriter2 = new PrintWriter(file2);
        Scanner scanner1 = new Scanner(file1);
        Scanner scanner2 = new Scanner(file1);
        List<Integer> numbers = new ArrayList<>();
        while (scanner1.hasNextLine()) {
            String line = scanner1.nextLine();
            numbers.add(Integer.parseInt(line));
        }
        double sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i==0 || (i+1) % 20 != 0 ) {
                sum += numbers.get(i);
            } else {
                printWriter2.println(sum / 20);
                sum = 0;
            }
        }
        printWriter2.close();


    }
}
