import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Student student = new Student("Nick");
       Teacher teacher = new Teacher("Bob Petrovich", "Math");
       teacher.evaluate(student);
    }
}
