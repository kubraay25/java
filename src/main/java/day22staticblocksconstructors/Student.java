package day22staticblocksconstructors;

public class Student {

    String name;
    int age;
    int grate;
    String stdId;

    public Student(String name, int age, int grate, String stdId) {
        this.name = name;
        this.age = age;
        this.grate = grate;
        this.stdId = stdId;
    }

    public Student(String name, int age, String stdId) {
        this.name = name;
        this.age = age;
        this.stdId = stdId;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grate=" + grate +
                ", stdId='" + stdId + '\'' +
                '}';
    }
}
