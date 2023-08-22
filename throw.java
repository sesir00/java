public class throw {
    public static void main(String[] args) {
    
        int age = -5;
        
        try {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
            System.out.println("Age is: " + age);
        } catch (IllegalArgumentException ex) {
            System.out.println("Caught an exception: " + ex.getMessage());
        }
    }
}
