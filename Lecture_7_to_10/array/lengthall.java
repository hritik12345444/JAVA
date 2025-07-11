//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
package Lecture_7_to_10.array;

import java.util.Scanner;
public class lengthall {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size : ");
        int size = sc.nextInt();
        String []arr = new String[size];

        for(int i= 0; i<size; i++){
            System.out.print("Enter name : ");
            arr[i] = sc.next();
        }

        int leng = 0;

        for(int i=0;i<size; i++){
            // System.out.println(arr[i] + " ");
            leng += arr[i].length();
        }

        System.out.println(leng);
        
        sc.close();
    }
}
