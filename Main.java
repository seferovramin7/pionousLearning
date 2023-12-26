package Lesson_22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        Student alice = new Student("Alice", "Ford", 101, 24);
        Student bob = new Student("Bob", "Smith", 102, 50);
        Student charlie = new Student("Charlie", "McArthur", 100, 35);

        studentList.add(charlie);
        studentList.add(alice);
        studentList.add(bob);


        List<Integer> values = new ArrayList<>();

        values.add(105);
        values.add(6233);
        values.add(22);
        values.add(12);
        values.add(983);

        values.sort(Comparator.reverseOrder());


        for (Integer i : values) {
            System.out.println(i);
        }
    }

    private static void bySurname(List<Student> studentList) {
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.surname.compareTo(s2.surname);
            }
        });

        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    private static void byName(List<Student> studentList) {
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });

        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
