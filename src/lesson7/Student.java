package lesson7;

public class Student extends HumanInherit {
    int age ;
    double grade ;

    public Student(String name, int age, double grade) {
        super(name);
        this.age = age;
        this.grade = grade;
    }

    @Override
    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);


    }

    public double infoGrade(double grade) {
        if (grade > 90 ){
            System.out.println("Siz elachisiniz");
        }else {
            System.out.println("Chalishin yaxshi oxuyun");
        }
        return grade;
    }



    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", grade=" + grade +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
