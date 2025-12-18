package lesson9;

import lesson6.Human;
import onlineMeeting.abstractExamples.UserNotException;
import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExamples {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
//        System.out.println("Xahish edirem ededi daxil edin");
//
//        try {
//            System.out.println("Eded daxil et ");
//            int a =  input.nextInt();
//            System.out.println("2 ci Eded daxil et ");
//            int b = input.nextInt();
//
//            int d = 10 / 0 ;
//
//
//            int [] arr = {123,4,3,2};
//            arr[6] = 16;
//
//            System.out.println(arr[6]);
//
//        }catch (InputMismatchException e){
//            System.out.println("Invalid input");
//        }catch (ArithmeticException e){
//            System.out.println("Division by zero");
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Array index out of bounds");
//        }catch (Exception e){
//            System.out.println("Exception");
//        }

        try {
            File file = new File("example.txt");
            FileReader fileReader = new FileReader(file);
            fileReader.read();
            fileReader.close();
        }catch (IOException e ){
            System.out.println("File not found");

        }




    }
}
