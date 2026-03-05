package opgave03.model;

import java.util.*;

public class College {
    private String name;

    private Map<Integer, Student> students = new LinkedHashMap<>();

    public College(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.put(student.getStudentNumber(), student);
    }

    public void removeStudent(Student student) {
        students.remove(student.getStudentNumber());
    }

    public double calcAverage() {
        double sum = 0;
        int count = 0;
        for (Student student : students.values()) {
            for (Integer grade : student.getGrades()) {
                sum += grade;
                count++;
            }
        }
        return Math.round(sum / count * 10.0)/10.0;
    }

    public Student findStudent(int studentNumber) {
        return students.get(studentNumber);
    }

    @Override
    public String toString() {
        return "College{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }

    public Map<Integer, Student> getStudents() {
        return students;
    }
}
