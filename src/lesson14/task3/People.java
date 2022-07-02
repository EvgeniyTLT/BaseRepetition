package lesson14.task3;

public class People {
    private String name;
    private int year;

    public People(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public void setYear(int year) {
        this.year = year;
    }
}
