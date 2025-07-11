// Find the maximum & minimum number in an array of integers.
// Integer.MAX_VALUE  return maximum integer value
// Integer.MIN_VALUE  return minimum value
package Lecture_7_to_10.array;

import java.util.Scanner;

public class min_max{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size : ");
        int size = sc.nextInt();

        int []arr = new int[size];
        for(int i =0; i<size; i++){
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }

        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE; 
        for(int i =0; i<size; i++){
            if(arr[i] > max ){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("maximum integer value in this array is : "+max);
        System.out.println("minimum integer value in this array is : "+min );


        sc.close();
    }
}