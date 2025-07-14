// Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.
package Lecture_7_to_10.TwoDArray;

import java.util.Scanner;

public class search {
   public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter row : ");
        int row = sc.nextInt();
        System.out.print("enter column : ");
        int colm = sc.nextInt();

        int [][]arr = new int [row][colm];

        // taking input a matrix by user
        for(int i = 0; i<row; i++){
            for(int j = 0; j<colm; j++){
                System.out.print("enter element : ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("enter x : ");
        int x = sc.nextInt();


        boolean isFound = false;
        //find element from matrix(2-D Array)
        for(int i = 0; i<row; i++){
            for(int j = 0; j<colm; j++){
                // System.out.print(arr[i][j] + " ");
                if(arr[i][j] == x){
                    System.out.println("number is found..... At index "+ "[" + i +"]" + "[" + j +"]");
                    isFound = true;
                    break;
                }
                
            }
            System.out.println();
        }
        if(isFound == false){
            System.out.println("number is not found....");
        }

        // printing in matrix
        for(int i = 0; i<row; i++){
            for(int j = 0; j<colm; j++){
                System.out.print(arr[i][j] + " ");
               
            }
            System.out.println();
        }
        sc.close();
   } 
}