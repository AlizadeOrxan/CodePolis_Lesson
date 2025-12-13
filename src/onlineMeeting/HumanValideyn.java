package onlineMeeting;

public class HumanValideyn {
  protected   String name;
  protected   String surname;

    public HumanValideyn(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    void nefesAlir(){
        System.out.println(name + " " + surname  + " nefes alir");
    }


    void speaking(){
        System.out.println(name + " " + surname  + " ingilisce danishir");
    }

    public static String createName(String name , int grade){
        return name + " " + grade ;
    }


}
