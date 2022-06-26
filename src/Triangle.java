public class Triangle extends Figure {
    private double lengthA;
    private double lengthB;
    private double lengthC;

    public Triangle(String color, double lengthA, double lengthB, double lengthC) {
        super(color);
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    public double getLengthA() {
        return lengthA;
    }

    public void setLengthA(int lengthA) {
        this.lengthA = lengthA;
    }

    public double getLengthB() {
        return lengthB;
    }

    public void setLengthB(int lengthB) {
        this.lengthB = lengthB;
    }

    public double getLengthC() {
        return lengthC;
    }

    public void setLengthC(int lengthC) {
        this.lengthC = lengthC;
    }

    @Override
    public double area() {
        double p = 0.5 * (getLengthA() + getLengthB() + getLengthC());
        return Math.sqrt(p * (p - getLengthA()) * (p - getLengthB()) * (p - getLengthC()));
    }

    @Override
    public double perimeter() {
        return getLengthA() + getLengthB() + getLengthC();
    }
}
