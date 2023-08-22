import java.util.Scanner;
public class largest {
    private double num1;
    private double num2;
    private double num3;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        num3 = scanner.nextDouble();
    }

    public double largest() {
        return Math.max(num1, Math.max(num2, num3));
    }

    public void display() {
        System.out.println("Input Numbers: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("Largest Number: " + largest());
    }
}

class Main {
    public static void main(String[] args) {
        largest processor = new largest();

        // Get input from the user
        processor.input();

        // Display the largest number
        processor.display();
    }
}


