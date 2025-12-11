package lesson7.abstraction;

public class Car extends Engine {

    String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    void drive() {
        super.drive();
    }

    @Override
    public void printInfo(String name, double engineSize) {
        System.out.println("Car name -> " + name);
        System.out.println("Car engine size -> " + engineSize);
    }

    public String getModel(String name) {
        return  name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }


    public static void info (String name){
        System.out.println("Car info is " + name);
    }




}
