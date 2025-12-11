package lesson6;

public class Human {

 String name , surname ;
    int age ;
    double weight , height ;
    Phone phone ;

    public Human(String name, String surname, int age, double weight, double height) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Human(String name, String surname, Phone phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;

    }

    void printInfo(){
        System.out.println(" Name is " + name);
        System.out.println(" Surname is " + surname);
        System.out.println(" Age is " + age);
    }


    public Human() {

    }







        @Override
   public String toString(){
       return name + "  " + surname + " " + phone;
    }
}
