package examples.lesson5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ExamplesArrays {
    public static void main(String[] args) {

        // Array Single



        // data_Type [] variable = new data_Type [3];

//        Scanner input = new Scanner(System.in);
//        System.out.println("Xahish edirik arrayinizin olchusunu daxil edin");
//        int olchu = input.nextInt();
//
//        int [] arr = new int[olchu]; //4
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Index : " + i);
//            arr[i] = input.nextInt();
//        }
//
//        Arrays.stream(arr).forEach(System.out::println);
//
//        int olchu2 = input.nextInt(); // 10
//
//        int [] newArray = new int [olchu2 + arr.length];
//
//        for (int i = arr.length; i < newArray.length - 1 ; i++) {
//            System.out.println("Index : " + i);
//            newArray[i] = input.nextInt();
//            newArray[i] = arr[i];
//        }
//
//        System.out.println("\nSort edilmeden once ");
//        System.out.println("\nSort edilmeden once ");
//
//
//        Scanner sc = new Scanner(System.in);
//
//        int[] arr = {1, 2, 3}; // başlanğıc array
//        System.out.println("Başlanğıc array: " + Arrays.toString(arr));
//
//        System.out.print("Neçə element əlavə etmək istəyirsən? ");
//        int addCount = sc.nextInt();
//
//        // 1. Yeni böyük array yaradılır
//        int[] newArr = new int[arr.length + addCount];
//
//        // 2. Köhnə array kopyalanır
//        for (int i = 0; i < arr.length; i++) {
//            newArr[i] = arr[i];
//        }
//
//        // 3. Scanner ilə yeni elementlər alınır
//        for (int i = arr.length; i < newArr.length; i++) {
//            System.out.print("Yeni element daxil et: ");
//            newArr[i] = sc.nextInt();
//        }
//
//        // 4. Nəticə
//        System.out.println("Yeni array: " + Arrays.toString(newArr));

        Scanner input = new Scanner(System.in);
        String [] arr = {"Nurlan","Vusal","Kamil"};
        String axtarilanad1 = input.nextLine();

        boolean tapildi = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(axtarilanad1)) {
                System.out.println("Movcud indeks " + i);
                tapildi = true;
            }

        }


        if (tapildi) {
            System.out.println("Tapilan ad " + axtarilanad1);
        }else {
            System.out.println("Movcud deyil bele bir ad ");
        }


    }
}
