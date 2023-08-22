
import java.util.Scanner;
public class exceptionexample {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = scanner.nextInt();

        System.out.println("Enter anumber: ");
        int b = scanner.nextInt();

        // System.out.println(a/b);

        try{
            System.out.println(a/b);
        }catch(Exception e){
            System.out.println("You have entered zero Please");
            System.out.println("Enter a number:");
            b = scanner.nextInt();
            e.printStackTrace();
            System.out.println(a/b);
        }
    }
}
