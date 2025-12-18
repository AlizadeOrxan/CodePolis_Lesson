package crudWithArray;

import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library(3,3);



        while (true){
            System.out.println("\n ----Welcome to Book Management System----");

            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. List Books");
            System.out.println("4. Update Book");
            System.out.println("5. Exit");

            System.out.println("Enter your choice: ");


            try {
                int choice = sc.nextInt();
                sc.nextLine();



                switch (choice) {

                    case 1:
                        try {
                            System.out.println("Enter row");
                            int row = sc.nextInt();
                            System.out.println("Enter column");
                            int col = sc.nextInt();
                            sc.nextLine();

                        System.out.println("Enter book title");
                        String title = sc.nextLine();
                        System.out.println("Enter book author");
                        String author = sc.nextLine();
                        System.out.println("Enter book publication year");
                        int  publicationYear = sc.nextInt();
                        System.out.println("Enter book price");
                        double price = sc.nextDouble();

                        Book newBook = new Book(title, author, publicationYear, price);
                        library.addBook(row,col,newBook);
                        break;
                        }catch (InputMismatchException e){
                            System.out.println("Invalid : Please enter number" + e.getMessage());
                        }

                        case 2:
                            try {


                                System.out.println("Enter row ");
                                int rowDelete = sc.nextInt();
                                System.out.println("Enter column");
                                int colDelete = sc.nextInt();
                                library.deleteBook(rowDelete, colDelete);
                                break;
                            }catch (InputMismatchException e ){
                                System.out.println("Invalid : Please enter number" + e.getMessage());
                            }
                            case 3:
                                library.viewBooks();
                                break;

                                case 4:
                                    System.out.println("Enter row");
                                    int rowUpdate = sc.nextInt();
                                    System.out.println("Enter column");
                                    int colUpdate = sc.nextInt();
                                    sc.nextLine();

                                    System.out.println("Enter book title");
                                    String newTitle = sc.nextLine();
                                    System.out.println("Enter book author");
                                    String newAuthor = sc.nextLine();
                                    System.out.println("Enter book publication year");
                                    int  newPublication = sc.nextInt();
                                    System.out.println("Enter book price");
                                    double newPrice = sc.nextDouble();
                                    sc.nextLine();


                                    library.updateBook(rowUpdate,colUpdate,newTitle,newAuthor,newPublication,newPrice);
                                    break;

                                    case 5:
                                        System.out.println("Exiting program.........");
                                        sc.close();
                                        return;


                    default:
                        System.out.println("Invalid choice ");
                }
            }catch (LibraryException | ArrayIndexOutOfBoundsException e){
                System.out.println("Error "   + e.getMessage());
            }catch (InputMismatchException e ){
                System.out.println("Write correct number " + e.getMessage());
            } catch (Exception e){
                System.out.println("Error "   + e.getMessage());
            }



        }

    }
}
