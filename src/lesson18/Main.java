package lesson18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String > animals = new ArrayList<>();

        animals.add("asfsdfadfsdfgd");
        animals.add("s");
        animals.add("thnrng");
        animals.add("nbdfbnd");
        animals.add("vsiooidgs");
        animals.add("pfdgpd");
        animals.add("nmf");
        animals.add("шаппв");

        Collections.sort(animals, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()>o2.length()){
                    return 1;
                } else if (o1.length()<o2.length()){
                    return -1;
                } else return 0;
            }
        });
        System.out.println(animals);


    }
}
