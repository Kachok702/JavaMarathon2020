package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> autoName = new ArrayList<>();
        autoName.add("BMW");
        autoName.add("Lada");
        autoName.add("Mazda");
        autoName.add("Honda");
        autoName.add("KIA");
        System.out.println(autoName);
        autoName.add(2, "Mercedes");
        System.out.println(autoName);
        autoName.remove(0);
        System.out.println(autoName);
            }
}
