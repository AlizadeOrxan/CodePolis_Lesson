package onlineMeeting.abstractExamples;

public class Airplane extends Engine{
    String brand;

    public Airplane(String name, String description, String brand) {
        super(name, description);
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "brand='" + brand + '\'' +
                '}';
    }


    @Override
    public void startEngine() {
        System.out.println("Airplane is starting");
    }

    @Override
    void stopEngine(String name) {
        super.stopEngine(name);
        System.out.println("Airplane oz metodu kimi istifade edir ");
    }
}
