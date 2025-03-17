package day11;

public class Picker implements Worker {
    private int salary;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountOrders(warehouse.getCountOrders() + 1);
    }

    @Override
    public void bonus() {
        if (salary == 80){
        if (warehouse.getCountOrders() >= 1500) {
            salary = salary * 3;
        }} else return;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                '}';
    }
}

