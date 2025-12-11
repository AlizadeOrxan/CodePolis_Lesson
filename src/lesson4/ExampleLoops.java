package lesson4;

import java.util.Random;
import java.util.Scanner;

public class ExampleLoops {
    public static void main(String[] args) {

        // Loops

        // For(bashlangic ; shert ; saygac)

        Scanner input = new Scanner(System.in);

//        String in ;
//
//       do {
//           System.out.println("Zehmet olmazsa sechim edin");
//           System.out.println("1 - i sechin ");
//           System.out.println("2 - ni sechin");
//           System.out.println("3 - ni sechin");
//           System.out.println("4 - ni sechin");
//           System.out.println("Yes / No ");
//            in = input.nextLine();
//
//       }while (in.equals("yes"));
//        System.out.println("Sistem dayandi");


        String[] name = {"Namiq" , "Murad" , "Vusal"};

//        for(String var : name){
//            System.out.print(var + " ");
//        }

        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + " ");

        }



    }
}

