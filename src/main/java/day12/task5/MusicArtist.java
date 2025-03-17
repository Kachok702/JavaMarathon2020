package day12.task5;

public class MusicArtist {
    private String nameArtist;
    private int yearArtist;

    @Override
    public String toString() {
        return                 "{nameArtist='" + nameArtist + '\'' +
                ", yearArtist=" + yearArtist +
                '}';
    }

    public MusicArtist(String nameArtist, int yearArtist) {
        this.nameArtist = nameArtist;
        this.yearArtist = yearArtist;
    }

    public String getNameArtist() {
        return nameArtist;
    }

    public void setNameArtist(String nameArtist) {
        this.nameArtist = nameArtist;
    }

    public int getYearArtist() {
        return yearArtist;
    }

    public void setYearArtist(int yearArtist) {
        this.yearArtist = yearArtist;
    }
}
