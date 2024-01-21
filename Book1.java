public class Book {
    private String title;
    private String author;
    private double price;
    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public static void main(String[] args) {
        Book b=new Book("The Great Gatsby", "F. Scott Fitzgerald", 15.99);
        
    // Getting and printing book details
    System.out.println("Title: " + b.getTitle());
    System.out.println("Author: " + b.getAuthor());
    System.out.println("Price: $" + b.getPrice());
        
    // Updating the price of the book
    b.setPrice(19.99);
    System.out.println("Updated Price: $" + b.getPrice());
    }
}
