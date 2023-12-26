package Lesson_22;

class Student {
    String name;

    String surname;

    int id;
    int age;

    public Student(String name,String surname, int id, int age) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
