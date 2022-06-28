package lesson12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> musicArtist;

    public MusicBand(String name, int year, List<MusicArtist> musicArtist) {
        this.name = name;
        this.year = year;
        this.musicArtist = musicArtist;
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

    public List<MusicArtist> getMusicArtist() {
        return musicArtist;
    }

    public void setMusicArtist(List<MusicArtist> musicArtist) {
        this.musicArtist = musicArtist;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", musicArtist=" + musicArtist +
                '}';
    }

    public void printMembers() {
        for (MusicArtist u : musicArtist
        ) {
            System.out.print(u + " ");
        }
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        musicBand1.getMusicArtist().addAll(musicBand2.getMusicArtist());
        musicBand2.getMusicArtist().clear();
        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
