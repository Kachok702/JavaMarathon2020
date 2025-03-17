package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Batman");
        members1.add("Flash");
        members1.add("AquaMen");
        MusicBand musicBand1 = new MusicBand("DC", 2014, members1);

                List<String> members2 = new ArrayList<>();
        members2.add("Hulk");
        members2.add("Iron Man");
        members2.add("Captain America");
        members2.add("Loki");
        MusicBand musicBand2 = new MusicBand("Marval", 2016, members2);
        musicBand1.printMembers();
        musicBand2.printMembers();
        System.out.println(" ");
        System.out.println(musicBand1);
        System.out.println(musicBand2);
        System.out.println(" ");
         MusicBand.transferMembers(musicBand1, musicBand2);

        System.out.println(" ");
        System.out.println(musicBand1);
        System.out.println(musicBand2);
        System.out.println(" ");
        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
