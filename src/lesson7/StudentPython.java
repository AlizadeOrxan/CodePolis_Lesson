package lesson7;

public class StudentPython extends StudentJava{

    public StudentPython(String name, int age, double grade) {
        super(name, age, grade);
    }


    @Override
    public String toString() {
        return "StudentPython{" +
                "age=" + age +
                ", grade=" + grade +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
