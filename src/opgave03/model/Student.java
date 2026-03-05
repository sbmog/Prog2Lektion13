package opgave03.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student> {
    private int studentNumber;
    private String name;
    private List<Integer> grades = new ArrayList<>();

    public Student(int studentNumber, String name, List<Integer> grades) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.grades = grades;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public List<Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber=" + studentNumber +
                ", name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (studentNumber > o.getStudentNumber()) return 1;
        else if (studentNumber==o.getStudentNumber()) return 0;
        else return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentNumber == student.studentNumber;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(studentNumber);
    }
}
