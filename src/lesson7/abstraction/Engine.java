package lesson7.abstraction;

public abstract class Engine {

    String model;


    void drive (){
        System.out.println("Car driving " + model);
    }

    public abstract void printInfo(String name , double engineSize);


}
