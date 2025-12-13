package onlineMeeting.abstractExamples;

import java.util.Objects;

public class Car  extends Engine{
    String brand;

    public Car(String name, String description, String brand) {
        super(name, description);
        this.brand = brand;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting Car");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }



}
