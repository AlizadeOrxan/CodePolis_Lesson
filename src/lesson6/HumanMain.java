package lesson6;

import java.util.Scanner;

public class HumanMain {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Telefon modelini daxil edin");
        String phoneName = input.nextLine();
        System.out.println("Telefon markasini daxil edin");
        String phoneModel = input.nextLine();
        System.out.println("Telefonu yaratdiniz ");

        System.out.println("________________________");

        System.out.println("Humanin deyerlerini daxil edin ");
        System.out.println("Adinizi daxil edin");
        String name = input.nextLine();
        System.out.println("Soyadinizia");
        String surname = input.nextLine();
        System.out.println("Yash");
        int age = input.nextInt();

        Phone telefon = new Phone(phoneName, phoneModel);

        Human human2 = new Human(name, surname, age, telefon);

//
//        System.out.println(human2.calcualate(3, 7));
//        System.out.println(human2.calcualate(4,7));
//        human2.calcualate(5,7,4,5);

        System.out.println(human2);






    }
}
