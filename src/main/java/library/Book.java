package library;

public class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    public void borrowBook(){
        System.out.println("Borrowing the book...");
        if(this.isAvailable){
            this.isAvailable = false;
            System.out.println("Borrowed successfully!");
            System.out.println("Availability after borrowing:  " + this.isAvailable);
        }
        else{
            System.out.println("Book is already borrowed");
        }
    }
    public void returnBook(){
        System.out.println("Returning the book...");
        this.isAvailable = true;
        System.out.println("Returned successfully!");
        System.out.println("Availability after returning:  " + this.isAvailable);
    }
    public void getBookInfo(){
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Available: " + this.isAvailable);
    }

}
