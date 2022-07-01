package lesson14.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("HiMen.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(printSumDigits(file));
    }

    public static Integer printSumDigits(File file) {
        int sum = 0;
        try {

            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            if (numbersString.length != 10) throw new IllegalArgumentException();
            for (String u : numbersString
            ) {
                sum += Integer.parseInt(u);
            }
            return sum;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не обнаружен");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return sum;
    }
}
