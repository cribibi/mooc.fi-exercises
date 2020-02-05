package week5.exercise88student;

public class Student {
    String name;
    String studentNumber;

    public Student(String name, String studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append(name).append(" (").append(studentNumber).append(")");
        return sb.toString();
    }
}
