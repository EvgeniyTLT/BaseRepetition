public class Airplane {
    private int fuel=0;

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void fillUp(int addFuel){
        setFuel(getFuel()+addFuel);
    }
}
