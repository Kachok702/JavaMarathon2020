package day12.task5;


import java.util.ArrayList;
import java.util.List;


public class MusicBand {
    private String name;
    private int year;
        private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
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

public static void transferMembers(MusicBand bands1, MusicBand bands2){
              List<MusicArtist> members1 =new ArrayList<>(bands1.getMembers());
    List<MusicArtist> members2 =new ArrayList<>(bands2.getMembers());
        for (MusicArtist person : members1){
            members2.add(person);
        }
        bands2.setMembers(members2);
        members1.clear();
        bands1.setMembers(members1);

}

public void printMembers(){
    System.out.println(this.getMembers());

}
}
