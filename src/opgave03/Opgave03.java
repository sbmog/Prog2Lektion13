package opgave03;

import opgave03.model.College;
import opgave03.model.Student;

import java.util.*;

public class Opgave03 {
    public static void main(String[] args) {
        // Opret studerende
        Student s1 = new Student(1, "Anna", new ArrayList<>(List.of(10, 7, 12)));
        Student s2 = new Student(2, "Bent", new ArrayList<>(List.of(4, 7, 2)));
        Student s3 = new Student(3, "Clara", new ArrayList<>(List.of(12, 10, 10)));
        Student s4 = new Student(1, "FakeAnna", new ArrayList<>(List.of(0, 0, 0))); // Samme studentNumber som s1

        // Test hashCode og equals - Set må ikke tage dublet
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4); // Skal ignoreres pga. equals og hashCode

        System.out.println("Students i Set (uden dublet):");
        studentSet.forEach(System.out::println);

        // Opret College med Map
        College college = new College("Tech College");
        Map<Integer, Student> studentMap = new LinkedHashMap<>();
        for (Student s : studentSet) {
            college.addStudent(s);
        }

        // Test calcAverage()
        System.out.println("\nGennemsnit af alle karakterer: " + college.calcAverage());

        // Test findStudent
        System.out.println("\nFind student med nr. 2:");
        System.out.println(college.findStudent(2));

        // Test sortering med Comparable (studentNumber)
        List<Student> studentList = new ArrayList<>(studentSet);
        System.out.println("\nFør sortering på studentNumber:");
        studentList.forEach(System.out::println);
        Collections.sort(studentList);
        System.out.println("\nEfter sortering på studentNumber:");
        studentList.forEach(System.out::println);

        // Test sortering med Comparator (navn)
        studentList.sort(Comparator.comparing(Student::getName));
        System.out.println("\nEfter sortering på navn:");
        studentList.forEach(System.out::println);
    }
}



