package lesson12.task1;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Q");
        list1.add("W");
        list1.add("E");
        list1.add("R");
        list1.add("T");
        for (String u: list1
             ) {
            System.out.print(u+" ");
        }
        list1.add(2, "POP");
        System.out.println();
        for (String u: list1
        ) {
            System.out.print(u+" ");
        }
        list1.remove(0);
        System.out.println();
        for (String u: list1
        ) {
            System.out.print(u+" ");
        }
    }
}
