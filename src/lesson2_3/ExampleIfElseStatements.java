package lesson2_3;

import java.io.FileWriter;
import java.util.Scanner;

public class ExampleIfElseStatements {
    public static void main(String[] args) {




//
//        if (grade < 61 && grade > 51  ){
//            System.out.println("E - ");
//        } else if (grade < 91 && grade >= 81 ) {
//            System.out.println("B");
//        } else if (grade < 81 && grade >= 71 ) {
//            System.out.println("C");
//        }else if (grade < 71 && grade >= 61 ) {
//            System.out.println("D");
//        } else if (grade >= 91) {
//            System.out.println("A");
//        }else {
//            System.out.println("Your Examination result is F ");
//        }


//        String passwordOrkhan = "12345" ;
//        int passwordNamig = 5678 ;
//
//        if (name.equalsIgnoreCase("Orkhan") && passWord.equals(passwordOrkhan) ) {
//            System.out.println(
//            );
//
//        }
//        }
//
        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter the name of the file you would like to read: ");
//
//        while(true) {
//            int choice = input.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.println("Mushteri 1-i sechdi");
//                    break;
//                case 2:
//                    System.out.println("Mushteri 2-i sechdi");
//                    break;
//                case 3:
//                    System.out.println("Mushteri 3-i sechdi");
//                    break;
//                case 0:
//
//                    System.out.println("Bye bye");
//                    break;
//                default:
//
//                    System.out.println("Duzgun reqem daxil edin ");
//            }


//
//
//        if (name.equals("admin")){
//            if (passWord.equals("1234")){
//                System.out.println("Shifre dogrudur");
//                System.out.println("Admin girish etdi");
//
//            }else {
//                System.out.println("Shifreniz yalnishdir");
//            }
//        } else {
//            System.out.println("Girish olmadi");
//        }


//        int choice = input.nextInt();
//        int temp = 3 ;
//
//        while (temp == 0){
//            switch (choice){
//                case 1:
//                    System.out.println("Siz ugurlu reqem sechmediniz");
//                    temp--;
//                case 2:
//                    System.out.println("Siz ugurlu reqem sechmediniz");
//                    temp--;
//            }
//        }



        System.out.println("Melumat xarakterli mesaj");
        System.out.println("Sechimler 1 , 2 , 3");
        int sechim = input.nextInt();

        if (sechim == 1) {
            System.out.println("");

        } else if (sechim == 2 ) {
            System.out.println("asd");
        }else if (sechim == 3) {
            System.out.println("asd");
        }

        System.out.println(" Chox sag olun ");
        System.out.println("Xahish edirem activity-ni sechin");
        System.out.println("1 , 2, 3, 4,");
        int choice = input.nextInt();

        switch (choice){
            case 1:
                System.out.println();
                break;
            case 2:
                System.out.println();
                break;
            default:
                System.out.println();
        }


    }
}
