package lesson18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String > animals = new ArrayList<>();

        animals.add("asfsdfad");
        animals.add("shfjhsdj");
        animals.add("thnrng");
        animals.add("nbdfbnd");
        animals.add("vsiooidgs");
        animals.add("pfdgpd");
        animals.add("nmf");
        animals.add("шаппв");

        Collections.sort(animals);
        System.out.println(animals);


    }
}
