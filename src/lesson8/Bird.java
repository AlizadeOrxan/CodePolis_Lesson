package lesson8;

public class Bird extends Animal implements Flying,Running,Swimming {

    public Bird(String name, String color) {
        super(name, color);
    }

    @Override
    void eat() {

    }

    @Override
    public void fly() {
        System.out.println(name + " is flying");
    }


    @Override
    public void run() {
        System.out.println(name +" is running");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming");
    }

}
