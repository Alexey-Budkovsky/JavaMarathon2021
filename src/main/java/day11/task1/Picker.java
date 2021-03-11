package day11.task1;

public class Picker implements Worker {
    // public
    public static final int COUNT_BONUS = 10000;
    // private
    private static final int PICKER_SALARY = 80;
    private static final int PICKER_BONUS = 70000;
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    // Конструктор
    public Picker(Warehouse warehouse) {
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
        warehouse.incrementPickedOrders();
        salary += PICKER_SALARY;
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
        salary += PICKER_BONUS;
        isPayed = true;
    /*
        if (isPayed == true) return;
        if (this.warehouse.getCountPickedOrders() == 10000) {
            this.isPayed = true;
            this.salary += 70000;
        } else if (this.warehouse.getCountPickedOrders() < 10000) {
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
