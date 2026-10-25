package library.books;

public class Book {
    static int totalNumberOfBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalNumberOfBooks = 0;
    }

    { //Object Initialization
        totalNumberOfBooks++;
    }

    Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    Book(String isbn){
        this("Unknown", "Unknown", isbn);
    }

//    Book(String isbn, String title, String author){
//        this.title = title;
//        this.author = author;
//        this.isbn = isbn;
//    }
//
//    Book(String isbn){
//        this(isbn, "unknown", "unknown");
//    }

    static int getTotalNumberOfBooks(){
        return totalNumberOfBooks;
    }

    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already Borrowed");
        }else{
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title);
        }

    }

    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed, please give a review.");
        }else{
            System.out.println("This book is already in the library");
        }
    }
}
