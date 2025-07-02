// pattern 8
// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3
// 1 2 
// 1 
package Lecture_1_to_6.loops.pattern;

import java.util.Scanner;

public class pattern8{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter n : ");
        int n= sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.err.print(j +" ");
            }
            System.out.println();
        }
        sc.close();
    }
}