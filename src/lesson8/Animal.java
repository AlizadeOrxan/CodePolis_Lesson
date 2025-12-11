package lesson8;

public abstract class Animal {
    String name;
    String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("Color : " + color);
    }

    abstract void eat();

    void run(String name , int age){
        System.out.println("Name : " + name);
        System.out.println("age : " + age);
    }



}
