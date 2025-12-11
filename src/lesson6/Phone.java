package lesson6;

public class Phone {


    String brand, model;


    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    //
    @Override
    public String toString() {
//        return "Phone{" +
//                "brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                '}';

        return brand + " " + model;
    }


}

