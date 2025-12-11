package lesson8;

public class Main {

    public static void main(String[] args) {


        Dog dog = new Dog("Alabash","Qirmizi");
        dog.run();
        dog.swim();

//        System.out.println();
//
        Bird bird = new Bird("Qaranqush","Qara");
        bird.run();
        bird.swim();
        bird.fly();

        System.out.println();

        Fish fish = new Fish("Salmon","Sari");
        fish.swim();

        System.out.println();


        Animal[] animal = {
                new Dog("Alabash","Qirmizi"),
                new Fish("Salmon","Sari"),
                 new Bird("Qaranqush","Qara")
        };

        for (Animal a : animal) {
            a.displayInfo();
            System.out.println("_______________");
        }


        Animal a = new Dog("Alabash","Qirmizi");

        a.displayInfo();




    }

}
