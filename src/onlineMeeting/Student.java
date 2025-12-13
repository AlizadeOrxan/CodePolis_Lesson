package onlineMeeting;

public class Student extends Teacher implements  HerekEtme{
    double grade;

    public Student(String name, String surname, String subject, double grade) {
        super(name, surname, subject);
        this.grade = grade;
    }

    public String oxuyur (String name , String surname , double grade) {
        return name + " " + surname + " " + grade ;
    }

    @Override
    public void moving() {
        System.out.println(name + " hereket edir ");
    }




}
