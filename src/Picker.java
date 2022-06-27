public class Picker implements Worker {
    private int salary;
    private int allSalary = 0;
    private Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    public Picker(int salary, Warehouse warehouse) {
        this.salary = salary;
        this.warehouse = warehouse;
    }

    public int getAllSalary() {
        return allSalary;
    }

    @Override
    public void doWork() {
        if (warehouse.getCountOrder() % 1500 == 0 && warehouse.getCountOrder() > 2) {
            bonus();
        }
        allSalary += salary;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);
    }

    @Override
    public void bonus() {
        this.salary = getSalary() * 3;
    }
}
