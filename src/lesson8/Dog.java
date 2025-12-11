package lesson8;

public class Dog extends Animal implements Running,Swimming {


    public Dog(String name, String color) {
        super(name, color);
    }


    @Override
    public void run() {
        System.out.println(name + " is running");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming");
    }

    @Override
    void eat() {
        System.out.println("Dog eating");
    }
}
