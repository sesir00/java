/*for this final project, you are required to develop a BookStack system in java so that books can be stored
in the system for such as the book title. ISBN number, authors, price, quantities, etc, and the system can be
used to support the book stock keeping purpose as much as possible. Although there are no specific mandatory
functionalines required for BookStock System, as students are allowed to freely design their their system. One
of the following features may be incorporateed to some ways:
1.New book stocks can be added.
2.Some stock records can be altered and/or removed.
3.All books can be listed for the ISBN, title, authors, price and quantity.
4.Minimal form of search facility is available to find or sort books.
5.Stock records can be stored externally and reloaded into the sytem.
we also expect that the system will be largly menu driven and the navigation among the book records should
also be possibe, perhaps through addition options on the main menu, or on a submenu when displaying a 
particular book detail, somewhat similar to 
current book
Next book
Previous book  
*/
import java.util.HashMap;
import java.util.Map;

public class BookStock {
    private String title;
    private String ISBN;
    private String author;
    private double price;
    private int quantity;

    public Book(String title, String ISBN, String author, double price, int quantity) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and setters
    // ...

    public String toString() {
        return "Title: " + title +
               "\nISBN: " + ISBN +
               "\nAuthor: " + author +
               "\nPrice: " + price +
               "\nQuantity: " + quantity;
    }
}

class BookStockSystem {
    private Map<String, Book> bookMap;

    public BookStockSystem() {
        bookMap = new HashMap<>();
    }

    public void addBook(Book book) {
        bookMap.put(book.getISBN(), book);
    }

    public Book getBook(String ISBN) {
        return bookMap.get(ISBN);
    }

    public void updateQuantity(String ISBN, int newQuantity) {
        Book book = bookMap.get(ISBN);
        if (book != null) {
            book.setQuantity(newQuantity);
        } else {
            System.out.println("Book not found.");
        }
    }

    // Other methods for searching, reporting, etc.
    // ...
}

class Main {
    public static void main(String[] args) {
        BookStockSystem stockSystem = new BookStockSystem();

        // Add some books to the system
        Book book1 = new Book("The Great Gatsby", "978-0-7432-7356-5", "F. Scott Fitzgerald", 10.99, 20);
        Book book2 = new Book("To Kill a Mockingbird", "978-0-06-112008-4", "Harper Lee", 12.49, 15);

        stockSystem.addBook(book1);
        stockSystem.addBook(book2);

        // Update the quantity of a book
        stockSystem.updateQuantity("978-0-7432-7356-5", 25);

        // Retrieve and display book information
        Book retrievedBook = stockSystem.getBook("978-0-7432-7356-5");
        if (retrievedBook != null) {
            System.out.println(retrievedBook);
        } else {
            System.out.println("Book not found.");
        }
    }
}


