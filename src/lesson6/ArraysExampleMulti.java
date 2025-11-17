package lesson6;

import java.util.Scanner;

public class ArraysExampleMulti {
    public static void main(String[] args) {




        // Multi Dimensional Arrays

        // Data_type [][] variables = new Data_type [][];
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Setirleri daxil edin ");
//        int row = sc.nextInt();
//        System.out.println("Sutunlari daxil edin ");
//        int column = sc.nextInt();
//
//        int [][] arrays = new int[row][column];
//
////
////        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//                System.out.printf(" Element [%d] [%d] -> " ,i,j);
//                arrays[i][j] = sc.nextInt();
//            }
//
//        }



//        for (int i = 0; i < arrays.length; i++) {
//            for (int j = 0; j < arrays[i].length; j++) {
//                System.out.print((arrays[i][j] = i + j) + " "  );
//            }
//            System.out.println();
//
//        }

//        int [] ar = new int[4];
//
//        for (int a : ar){
//            System.out.println(a);
//        }
//
////
//        for (int[] arr : arrays ){
//            for (int arr1 : arr){
//
//                System.out.print(arr1 + " ");
//            }
//            System.out.println();
//        }
////



        int[][] jaggedArray = new int[4][];

        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[4];
        jaggedArray[2] = new int[3];
        jaggedArray[3] = new int[1];

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = i * 10 + j;
            }
        }

        System.out.println("Jagged Array-in elementləri:");
        for (int[] row : jaggedArray) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }








    }
}
