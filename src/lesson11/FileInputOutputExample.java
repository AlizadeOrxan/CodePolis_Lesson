package lesson11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputExample {
    public static void main(String[] args) {

//        String path = "/Users/orkhanalizade/Downloads/CodePolis_Lesson/CodePolisData";

//        File folder = new File("/Users/orkhanalizade/Desktop/CodePolisders");
//        File file = new File(folder,"code.txt");  /// yuxarida yazdiqlaerim DEsktopdur
//
//        String path = "/Users/orkhanalizade/Downloads/CodePolis_Lesson";
//        File folder = new File(path);
//            File file = new File(folder, "yenicode.txt");
//        try {
//            if (!folder.exists()) {
//                folder.mkdir();
//                System.out.println("Folder created");
//            } else {
//                System.out.println("Folder exists");
//            }
//            if (!file.exists()) {
//                file.createNewFile();
//                System.out.println("File created");
//            }
//
//
//
//        }catch (IOException e) {
//            System.out.println("Error" +  e.getMessage());
//        }
//
//
//        System.out.println("Folder path " + folder.getAbsolutePath());
//        System.out.println("Filepath " + file.getAbsolutePath());
//        System.out.println("Folder name " + folder.getName());
//        System.out.println("Filename " + file.getName());
//
        File file = new File("/Users/orkhanalizade/Downloads/CodePolis_Lesson/YeniYaradilan/YeniYaradilan.txt"); /// Bu daxilde yaradir folder ve file


        String name = "Mushvig Gojayev\n";
        byte [] data = name.getBytes();
        byte [] symbols = {72,101,108,108,111};

        try (FileOutputStream fos = new FileOutputStream(file)) {

            fos.write(data);
            fos.write(symbols);

        }catch (IOException e) {
            e.printStackTrace();
        }


        try (FileInputStream fis = new FileInputStream(file)) {

            int read;

            while ((read = fis.read()) != -1) {
                System.out.print((char) read + " ");
            }



        }catch (IOException e) {
            e.printStackTrace();
        }








    }
}
