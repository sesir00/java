public class Author {
    private String firstName;
    private String lastName;
    
    //parameterized constructor
    public Author(String firstName, String lastName){
    this.firstName=firstName;
    this.lastName=lastName;
}
 //method to get a first name
 public String getFirstName(){
    return firstName;
 }
 //method to get last name
 public String getLastName(){
    return lastName;
 }
 public static void main(String[] args) {
    // creating a author object using the constructor
    Author a = new Author("Shishir", "Chapagain");
     System.out.println("First Name: " +a.getFirstName());
     System.out.println("last Name: " +a.getLastName());

 }
}
