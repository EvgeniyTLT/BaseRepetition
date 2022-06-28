package lesson12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> player;

    public MusicBand(String name, int year, List<String> player) {
        this.name = name;
        this.year = year;
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getPlayer() {
        return player;
    }

    public void setPlayer(List<String> player) {
        this.player = player;
    }

    public void printMembers() {
        for (String u : player
        ) {
            System.out.print(u+" ");
        }
    }


    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", player=" + player +
                '}';
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        musicBand2.getPlayer().addAll(musicBand1.getPlayer());
        musicBand1.getPlayer().clear();
        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
