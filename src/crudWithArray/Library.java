package crudWithArray;

public class Library {

    private Book[][] shelves ;

    public Library(int row , int cols) {
        shelves = new Book[row][cols];
    }


    ///  C +
    ///  R +
    ///  U +
    ///  D +


    public void addBook(int row , int col , Book book) throws LibraryException{
        if (shelves[row][col] != null){
            throw new LibraryException("Book already exists");
        }

        shelves[row][col] = book;
        System.out.println("Book added . Book's ID -> " + book.getId());
    }

    public void viewBooks(){
        System.out.println("\n Book List : ");
        for (int i = 0; i < shelves.length; i++){
            for (int j = 0; j < shelves[i].length; j++){
                if (shelves[i][j] != null){
                    System.out.print("[  " + shelves[i][j].getInfo() + " ] ");
                }else {
                    System.out.print(" [Bosh]\t");
                }
            }
            System.out.println();
        }

    }


    public void updateBook(int row , int col , String title , String author , int publicationYear, double price) throws LibraryException{
        if (shelves[row][col] == null){
            throw new LibraryException("Book not exists");
        }

        shelves[row][col].updateBooks(title, author, publicationYear, price);
        System.out.println("Book updated -> " + title + " " +  author + " " + publicationYear + " " + price );
    }


    public void deleteBook(int row , int col ) throws LibraryException{
        if (shelves[row][col] == null){
            throw new LibraryException("Book not exists with ID");
        }

        shelves[row][col] = null;
        System.out.println("Book has been deleted . ");
    }





}
