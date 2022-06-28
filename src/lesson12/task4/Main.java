package lesson12.task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> players1 = new ArrayList<>();
        MusicBand musicBand1 = new MusicBand("QQQ", 2000, players1);
        List<String> players2 = new ArrayList<>();
        MusicBand musicBand2 = new MusicBand("WWW", 1999, players2);
        players1.add("AAAA");
        players1.add("BBBB");
        players1.add("CCCC");
        players1.add("FFFF");
        players1.add("GGGG");
        players2.add("AAAA");
        players2.add("BBBB");
        players2.add("CCCC");
        players2.add("FFFF");
        players2.add("GGGG");
        musicBand1.printMembers();
        System.out.println();
        musicBand2.printMembers();
        System.out.println();
        MusicBand.transferMembers(musicBand1, musicBand2);

    }
}
