package lesson7;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Vusal",28,99.9);

        student.printInfo(); // bu Superden(Human) gelir
        System.out.println(student.infoGrade(95)); // bu Studentdentden gelir

        System.out.println("____________________________\n");
        Teacher teacher = new Teacher("Nurlan","Java Programming");
        teacher.printInfo();


        System.out.println(teacher);

        System.out.println("____________________________\n");

        StudentJava studentJava = new StudentJava("Vusal",28,99.9);
        studentJava.printInfo();
        System.out.println(studentJava);

        System.out.println("____________________________\n");

        StudentPython studentPython = new StudentPython("Akif",19,99.9);
        System.out.println(studentPython);


    }
}
