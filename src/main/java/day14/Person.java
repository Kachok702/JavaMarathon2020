package day14;

public class Person {
    private String name;
    private int year;

    public Person(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "{name='" + name + "', year=" + year + "}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return year;
    }

    public void setAge(int year) {
        this.year = year;
    }
}
