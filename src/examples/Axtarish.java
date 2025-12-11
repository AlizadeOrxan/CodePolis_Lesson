package examples;

import java.util.Scanner;

public class Axtarish {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zehmet olmazsa Array-in olchusunu daxil edin");
        int olchu = sc.nextInt();
        sc.nextLine();

        String[] adlar =  new String[olchu];

        System.out.println("Daxil etdiyiniz " + olchu + " qeder ad daxil edin");


        for (int i = 0; i < adlar.length; i++) {
            System.out.print("Ad -> " + (i+1) + " :");
            adlar[i] = sc.nextLine();
        }

        System.out.println("examples.Axtarish emeliyyati ");
        System.out.println("Daxil edin adi");
        String axtarilanad =  sc.nextLine();

        int ideks = -1 ; // linear search

        for (int i = 0; i < adlar.length; i++) {
            if (adlar[i].equals(axtarilanad)) {
                ideks = i;
                break;
            }
        }

        System.out.println("Netice ");

        if (ideks != -1) {
            System.out.println(axtarilanad + " Massivde tapilid ");
            System.out.println("Adin yerleshdiyi yer " + " [ " + ideks + " ]");
        }else {
            System.out.println("Bele adama uyoxdur");
        }



    }
}
