package lesson8.poli;

public class MethodOverloading {


    String name ;



    void displayInfo(String name, int age ){
        System.out.println("Hello World" + name + age );
    }

    public String greeting(String name , String surname){

        return "Hello " + name + " " + surname;
    }

    public String greeting(String name , String surname,double age){
        return "Hello " + name + " " + surname + " " + age;
    }

    public String greeting(String name , String surname,int age){
        return "Salam " + name + " " + surname + " " + age;
    }









}
