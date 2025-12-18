package crudWithArray;

public class Book {

    private static int nextID = 1 ;
    private int id ;

    private String title;
    private String author;
    private int publicationYear;
    private double price;


    public Book(String title, String author, int publicationYear, double price) {
        this.id = nextID++ ;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.price = price;
    }

    public int getId() {
        return id;
    }


    public void updateBooks(String title, String author, int publicationYear, double price) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.price = price;
    }

    public String getInfo(){
        return "# " + id + " | " + title + " | " + " by " + author + " | " + publicationYear + " | " + price + " AZN";
    }


}
