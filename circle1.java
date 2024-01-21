// define a class circle with instance variables radius and area and member methods getdata(), calcareaa() and display(). Create some intsances of the circle and display the calculated area

import java.util.Scanner;

public class circle {
    
        double radius;
        double area;
        
        public void getdata(){
            Scanner scanner = new Scanner(system.in);
            System.out.println("Enter the radius of the circle: ");
            radius = Scanner.nextDouble();
            scanner.close();
        }
        public void calcarea(){
            private double area;
            area = Math.PI*radius*radius;
        }
        public void display(){
            System.out.println("Circle- Radius %.2f " +radius);
            System.out.println("Area of circle %.2f%n" , area);
        }

    }
    public static void main(String[] args) {
        circle circle1 = new circle();
        circle circle2 = new circle();
        circle circle3 = new circle();

        circle1.getdata();
        circle1.calcarea();
        circle1.display();
    }
}
