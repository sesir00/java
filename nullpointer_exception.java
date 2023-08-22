import java.util.Scanner;

public class nullpointer_exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(system.in);
        String name;


        try {
            System.out.println(name);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        
    }
}
