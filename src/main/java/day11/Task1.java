package day11;

public class Task1 {
    public static void main(String[] args) {
Warehouse warehouse1 = new Warehouse();
Picker picker1 = new Picker(warehouse1);
Courier courier1 = new Courier(warehouse1);
for (int i = 1; i <= 1500 ;i++ ){
    picker1.doWork();
    }
        for (int i = 1; i <= 1000 ;i++ ){
            courier1.doWork();
        }
        System.out.println(warehouse1);
        System.out.println(picker1);
        System.out.println(courier1);
        picker1.bonus();
        courier1.bonus();
        System.out.println(warehouse1);
        System.out.println(picker1);
        System.out.println(courier1);

        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);
        picker2.doWork();
        courier2.doWork();

        System.out.println("");
        System.out.println(warehouse2);
        System.out.println(warehouse1);
        System.out.println(picker1);
        System.out.println(courier1);

    }
}
