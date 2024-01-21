//write a java program to calculate the average value of array elements 

import java.util.Scanner;

public class ArrayExample2 {
    public static void main(String[] args) {
       System.out.println("how many number you want to enter? ");
       Scanner scanner = new Scanner(system.in);
       int n = scanner.nextInt();
       int[] arr = new int[n];
       int total=0;

       for(i=0;i<arr.length;i++){
        System.out.print("enter element  no.:"+(i+1));
        arr[i]=scanner.nextInt();
       }
       scanner.close();
        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        }


        
        double average = total / arr.length;
        
        System.out.format("The average is: %.3f", average);
    }

    
}
