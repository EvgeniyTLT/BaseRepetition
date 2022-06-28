package lesson12.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>();
        MusicBand musicBand1 = new MusicBand("I1", 1995);
        MusicBand musicBand2 = new MusicBand("I2", 1996);
        MusicBand musicBand3 = new MusicBand("I3", 1997);
        MusicBand musicBand4 = new MusicBand("I4", 1998);
        MusicBand musicBand5 = new MusicBand("I5", 1999);
        MusicBand musicBand6 = new MusicBand("I6", 2000);
        MusicBand musicBand7 = new MusicBand("I7", 2001);
        MusicBand musicBand8 = new MusicBand("I8", 2002);
        MusicBand musicBand9 = new MusicBand("I9", 2003);
        musicBands.add(musicBand1);
        musicBands.add(musicBand2);
        musicBands.add(musicBand3);
        musicBands.add(musicBand4);
        musicBands.add(musicBand5);
        musicBands.add(musicBand6);
        musicBands.add(musicBand7);
        musicBands.add(musicBand8);
        musicBands.add(musicBand9);

        System.out.println(musicBands);
        System.out.println(groupsAfter2000(musicBands));

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (MusicBand u : bands) {
            if (u.getYear() >= 2000) {
                groupsAfter2000.add(u);
            }

        }
        return bands = groupsAfter2000;
    }


}
