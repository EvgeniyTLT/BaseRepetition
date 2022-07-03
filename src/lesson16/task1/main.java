package lesson16.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        File file = new File("HiMen.txt");
        printResult(file);
    }

    public static void printResult(File file) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        double result = 0;
        double counter = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] array = line.split(" ");
            for (int i = 0; i < array.length; i++) {
                counter += Integer.parseInt(array[i]);
            }
            result = counter / array.length;
            System.out.println(result);
            System.out.println(Math.round(result*1000.0)/1000.0);
        }
    }
}
