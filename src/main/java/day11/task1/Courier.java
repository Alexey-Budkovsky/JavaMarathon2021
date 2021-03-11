package day11.task1;

public class Courier implements Worker {
    // private
    private static final int COURIER_SALARY = 100;
    private static final int COURIER_BONUS = 50000;
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;


    // Конструктор
    public Courier(Warehouse warehouse) {

        this.warehouse = warehouse;
    }

    // Геттеры
    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    // Методы
    @Override
    public void doWork() {
        warehouse.incrementDeliveredOrders();
        salary += COURIER_SALARY;
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() < COUNT_BONUS) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += COURIER_BONUS;
        isPayed = true;

    /*
        if (isPayed == true) return;
        if (this.warehouse.getCountDeliveredOrders() == 10000) {
            this.isPayed = true;
            this.salary += 50000;
        } else if (this.warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else System.out.println("Бонус уже был выплачен");
    */
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

}
