package day12.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Непоседы", 2017);
        MusicBand musicBand2 = new MusicBand("Король и Шут", 2022);
        MusicBand musicBand3 = new MusicBand("БИ 2", 2020);
        MusicBand musicBand4 = new MusicBand("Иванушки", 2017);
        MusicBand musicBand5 = new MusicBand("Ленинград", 2005);
        MusicBand musicBand6 = new MusicBand("Holyywid", 1994);
        MusicBand musicBand7 = new MusicBand("Развивайка", 1999);
        MusicBand musicBand8 = new MusicBand("Реперы", 2000);
        MusicBand musicBand9 = new MusicBand("Рокеры", 2014);
        MusicBand musicBand10 = new MusicBand("Ранетки", 2007);

        List<MusicBand> bands = new ArrayList<>();
        bands.add(musicBand2);
        bands.add(musicBand3);
        bands.add(musicBand4);
        bands.add(musicBand5);
        bands.add(musicBand6);
        bands.add(musicBand7);
        bands.add(musicBand8);
        bands.add(musicBand9);
        bands.add(musicBand10);
        Collections.shuffle(bands);
        System.out.println(bands);

        groupsAfter2000(bands);


    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> musicBandsAfter2000 = new ArrayList<>();

        for (MusicBand band : bands){
            if (band.getYear()>2000){
                musicBandsAfter2000.add(band);
            }
        }
        System.out.println(musicBandsAfter2000);
        return musicBandsAfter2000;
    }
}