package lesson1to11;

public class Airplane {
    private int fuel=0;

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void fillUp(int addFuel){
        if (getFuel()+addFuel>=1000){
            System.out.println("бак полный");
            setFuel(1000);
        } else
        setFuel(getFuel()+addFuel);
    }
}
