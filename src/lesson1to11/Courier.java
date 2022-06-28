package lesson1to11;

public class Courier implements Worker {
    private int salary;
    private int allSalary = 0;
    private Warehouse warehouse;

    public Courier(int salary, Warehouse warehouse) {
        this.salary = salary;
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public int getAllSalary() {
        return allSalary;
    }

    @Override
    public void doWork() {
        if (warehouse.getBalance() % 1000000 == 0 && warehouse.getBalance() > 2) {
            bonus();
        }
        allSalary += salary;
        warehouse.setBalance(warehouse.getBalance() + 1000);
    }

    @Override
    public void bonus() {
        salary = getSalary() * 2;
    }
}
