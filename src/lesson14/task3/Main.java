package lesson14.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList());
    }


    public static List<People> parseFileToObjList() {
        File file = new File("people.txt");
        try {
            Scanner scanner = new Scanner(file);
            List<People> peopleList = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                if (Integer.parseInt(person[1]) < 0) throw new IllegalArgumentException();
                peopleList.add(new People(person[0], Integer.parseInt(person[1])));
            }
            return peopleList;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Отрицательный возраст");
        }
        return null;
    }
}
