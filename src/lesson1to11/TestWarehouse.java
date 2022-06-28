package lesson1to11;

public class TestWarehouse {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(0, 0);
        Picker picker = new Picker(80, warehouse);
        Courier courier = new Courier(100, warehouse);
        for (int i = 0; i < 3005; i++) {
            picker.doWork();
        }
        for (int i = 0; i < 2008; i++) {
            courier.doWork();
        }
        System.out.println(warehouse);
        System.out.println(picker.getSalary());
        System.out.println(courier.getSalary());
    }
}
