// Take an array of names as imput from the user and print them on the screen.
package Lecture_7_to_10.array;

import java.util.Scanner;
public class arrayOfName {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter size : ");
        int size = sc.nextInt();
        String []arr = new String[size];
        for(int i= 0; i<size; i++){
            System.out.print("enter name : ");
            arr[i] = sc.next();
        }

        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
