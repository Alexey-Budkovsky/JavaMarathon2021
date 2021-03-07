package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    //Конструктор
    public Picker(int salary, boolean isPayed, Warehouse warehouse) {
        this.salary = salary;
        this.isPayed = isPayed;
        this.warehouse = warehouse;
    }

    //Геттеры
    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        this.warehouse.countPickedOrders++;
        this.salary += 80;
    }

    @Override
    public void bonus() {
        if (isPayed == true) return;
        if (this.warehouse.getCountPickedOrders() == 10000) {
            this.isPayed = true;
            this.salary += 70000;
        } else if (this.warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else System.out.println("Бонус уже был выплачен");
    }

}
