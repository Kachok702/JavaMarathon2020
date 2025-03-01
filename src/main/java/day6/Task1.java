package day6;

public class Task1 {
    public static void main(String[] args) {
Car Lastocka = new Car();
Lastocka.setYear(2020);
Lastocka.setColor("Black");
Lastocka.setModel("Mazda CX-5");
Motorbike FarshNaKolesach = new Motorbike("Yakhoma", "Red",2017);
Lastocka.info();
        System.out.println(Lastocka.yearDifference(2025));
FarshNaKolesach.info();
        System.out.println(FarshNaKolesach.yearDifference(2000));

    }

}
