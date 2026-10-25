package College;

public class Student {
    //Priority queue based
    private final String name;
    private final char grade;

    public Student(String name, char grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name + " " + grade;
    }
}
