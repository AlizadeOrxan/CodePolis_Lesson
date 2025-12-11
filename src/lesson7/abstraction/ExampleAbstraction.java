package lesson7.abstraction;

import java.util.Scanner;

public class ExampleAbstraction {
    public static void main(String[] args) {

        Car car1;

//        Engine engine = new Car("Mercedes");

        Car car = new Car("BMW");

        car.drive();
//        car.getModel();
        car.printInfo("asdasd",7.8);

        Car.info(car.name);


        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();



    }
}
