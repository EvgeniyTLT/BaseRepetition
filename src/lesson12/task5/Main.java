package lesson12.task5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MusicArtist> musicArtists1 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            musicArtists1.add(new MusicArtist("1" + i, i));
        }
        List<MusicArtist> musicArtists2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            musicArtists2.add(new MusicArtist("2" + i, i));
        }
        MusicBand musicBand1 = new MusicBand("QQQQ", 2000, musicArtists1);
        MusicBand musicBand2 = new MusicBand("WWWW", 3333, musicArtists2);
        System.out.println(musicBand1.getMusicArtist());
        System.out.println(musicBand2.getMusicArtist());
        MusicBand.transferMembers(musicBand1, musicBand2);
        System.out.println(musicBand1.getMusicArtist());
        System.out.println(musicBand2.getMusicArtist());
    }
}
