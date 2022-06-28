package lesson1to11;

public class Teacher {
    private String name;
    private String subject;


    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        int grade = (int) (Math.random() * (5 - 2) + 2);
        System.out.println("Преподаватель " + getName() + " оценил студента с именем " + student.getName() +
                " по предмету " + getSubject() + " на оценку: " + grade);
    }
}
