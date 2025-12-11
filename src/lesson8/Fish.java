package lesson8;

public class Fish extends Animal implements Swimming {

    public Fish(String name, String color) {
        super(name, color);
    }


    @Override
    public void swim() {
        System.out.println(name + " is swimming");
    }

    @Override
    void eat() {
        System.out.println("fish eating");
    }
}
