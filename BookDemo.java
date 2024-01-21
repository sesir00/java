//write a seperate class BookDemo with main() method creates a book titled "The Complete Reference Java" with authors "Herbert Schildt" price 79.75 and print the title of book, author and price
public class BookDemo {
    private String title;
    private String author;
    private double price;
    public BookDemo(String title, String author, double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public static void main(String[] args) {
        BookDemo bd=new BookDemo("The Complete Reference Java","Herbert Schildt",79.75);
        System.out.println("Title: "+bd.title);
        System.out.println("Author: "+bd.author);
        System.out.println("Price: "+bd.price);
    }
}
