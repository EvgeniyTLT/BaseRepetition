package lesson1to11;

public class Circle extends Figure {
    private int r;

    public Circle(String color, int r) {
        super(color);
        this.r = r;
    }

    @Override
    public double area() {
        return getR() * getR() * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * getR() * Math.PI;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
