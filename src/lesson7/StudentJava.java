package lesson7;

public class StudentJava extends Student{

    public StudentJava(String name, int age, double grade) {
        super(name, age, grade);
    }

    @Override
    public String toString() {
        return "StudentJava{" +
                "age=" + age +
                ", grade=" + grade +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
