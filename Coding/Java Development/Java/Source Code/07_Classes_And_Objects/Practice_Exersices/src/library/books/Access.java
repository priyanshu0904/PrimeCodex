package library.books;

public class Access {
    static void main(String[] args) {
        Book designOfThings = new Book("Design", "Priyanshu", "1");
        Book headFirstJava = new Book("2");
        System.out.println(Book.getTotalNumberOfBooks());
        designOfThings.borrowBook();
        headFirstJava.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();

    }
}
