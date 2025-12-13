package onlineMeeting;

import lesson6.Human;

public class Teacher extends HumanValideyn implements HerekEtme {
    String subject ;

    public Teacher(String name, String surname, String subject) {
        super(name, surname);
        this.subject = subject;
    }


    public String dersKechir (String name , String surname , double salary ){
        return name + " - " + surname + " - " + salary;
    }

    @Override
    public void moving() {
        System.out.println(name + " hereket edir ");
    }


    @Override
    void nefesAlir() {
        System.out.println(name + " " +  surname  + " oz istediyi kimi nefes alir" );
    }


}
