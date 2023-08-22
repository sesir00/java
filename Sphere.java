/*design a class named sphere with three instance variables i.e. r,a,v (type double) and the following Member
methods to carry out the specified tasks as listed below:
Getdata(): to ask the user input radius of sphere
Area(): to calculate the area of sphere
Volume(): to calculate the volume of the sphere
Dispdata(): to display all the calculated values with the input data*/

import java.util.Scanner;

class CalculateArea {
    private double r; //radius
    private double a; //area
    private double v; //volume

    public void getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of sphere: ");
        r = scanner.nextDouble();
    }
    
    public void area(){
        a= 4*3.14*r*r;
    }

    public void volume(){
        v = (4.0 / 3.0) * 3.14* r * r * r;
    } 

    public void displayData(){
        System.out.println("Sphere data: ");
        System.out.println("Radius: " +r);
        System.out.println("Area: " +a);
        System.out.println("Volume: " +v);
    }
}

    public class Sphere{
        public static void main(String[] args) {
        CalculateArea sphere = new CalculateArea();

        // Get input data from the user
        sphere.getData();

        // Calculate area and volume
        sphere.area();
        sphere.volume();

        // Display calculated values along with input data
        sphere.displayData();
        }
}