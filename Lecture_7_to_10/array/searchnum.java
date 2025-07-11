// Take an array as input from the user. Search for a given number x and print the index at which it occurs.
package Lecture_7_to_10.array;

import java.util.Scanner;
public class searchnum{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size : ");
        int size = sc.nextInt();
        int []arr = new int[size];

        System.out.print("enter search number : ");
        int num = sc.nextInt();
        for(int i =0; i<size; i++){
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }

        boolean check = false;
        // search a particular number 
        for(int i=0; i<size; i++){
            if(arr[i] == num){
                System.out.print("number is found .....");
                System.out.print("this is index of number : " + i);
                System.out.println();
                check = true;
                break;
            }
        }
        if(check == false){
            System.out.print("number is not found ..");
            System.out.println();
        }
        System.out.println("the given array is ---->>>>");
        for(int i =0; i<size; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}