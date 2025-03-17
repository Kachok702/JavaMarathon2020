package day12.task5;



import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
       MusicArtist musicArtist1 = new MusicArtist("Batman", 42);
        MusicArtist musicArtist2 = new MusicArtist("Flash", 29);
        MusicArtist musicArtist3 = new MusicArtist("AquaMen", 36);

        List<MusicArtist> musicArtistMembers1 = new ArrayList<>();
        musicArtistMembers1.add(musicArtist1);
        musicArtistMembers1.add(musicArtist2);
        musicArtistMembers1.add(musicArtist3);

        MusicBand musicBand1 = new MusicBand("DC", 2014, musicArtistMembers1);

        MusicArtist musicArtist4 = new MusicArtist("Hulk", 40);
        MusicArtist musicArtist5 = new MusicArtist("Iron Man", 41);
        MusicArtist musicArtist6 = new MusicArtist("Captain America", 34);
        MusicArtist musicArtist7 = new MusicArtist("Loki", 24);
        List<MusicArtist> musicArtistMembers2 = new ArrayList<>();
        musicArtistMembers2.add(musicArtist4);
        musicArtistMembers2.add(musicArtist5);
        musicArtistMembers2.add(musicArtist6);
        musicArtistMembers2.add(musicArtist7);
        MusicBand musicBand2 = new MusicBand("Marvel", 2008, musicArtistMembers2);
        System.out.println(musicBand1);
        System.out.println(musicBand2);
        System.out.println(" ");
        MusicBand.transferMembers(musicBand1,musicBand2);
        musicBand1.printMembers();
        musicBand2.printMembers();
        System.out.println(" ");
        System.out.println(musicBand1);
        System.out.println(musicBand2);
        System.out.println(" ");
    }
}
