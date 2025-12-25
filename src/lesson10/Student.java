package lesson10;

public class Student {

    String name ;

    String surName;


    public Student(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
