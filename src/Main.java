import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        System.out.println(airplane.getFuel());
        airplane.fillUp(100);
        System.out.println(airplane.getFuel());
    }
}
