package lesson7;

public class Teacher extends HumanInherit {
   protected String subject ;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Subject: " + subject);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }


}
