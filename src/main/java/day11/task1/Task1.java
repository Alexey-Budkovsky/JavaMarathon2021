package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse depot1 = new Warehouse();
        Picker picker1 = new Picker(depot1);
        Courier courier1 = new Courier(depot1);

        businessProcess(picker1);
        System.out.println(picker1);
        System.out.println(depot1);

        businessProcess(courier1);
        System.out.println(courier1);
        System.out.println(depot1);

        System.out.println(depot1.getCountPickedOrders());
        System.out.println(depot1.getCountDeliveredOrders());

        System.out.println(picker1.getSalary());
        System.out.println(courier1.getSalary());

        Warehouse depot2 = new Warehouse();
        Picker picker2 = new Picker(depot2);
        Courier courier2 = new Courier(depot2);

        picker2.doWork();
        courier2.doWork();

        System.out.println("Первый склад:\n" + depot1);
        System.out.println("Второй склад:\n" + depot2);

        System.out.println(depot1.getCountPickedOrders());
        System.out.println(depot1.getCountDeliveredOrders());

        System.out.println(picker1.getSalary());
        System.out.println(courier1.getSalary());


    }

    static void businessProcess(Worker worker) {
        for (int i = 1; i <= 10000; i++) {
            worker.doWork();
//            if (i == 10000) worker.bonus();
        }
        worker.bonus();
    }
}
