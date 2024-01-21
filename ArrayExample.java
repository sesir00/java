//write a java program to calculate the sum values of an array
public class ArrayExample {
    public static void main(String[] args) {
        int[] x= new int[]{1,2,3,4,5};
        int sum=0;
        for(int i=0;i<x.length;i++){
            sum= sum + x[i];
        }
        System.out.println("The total sum of array= " + sum);

    }
}
