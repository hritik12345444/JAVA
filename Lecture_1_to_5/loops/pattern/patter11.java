// pattern 11 n = 4
//  *      *
//  **    **    
//  ***  ***
//  ********
//  ********
//  ***  ***
//  **    **
//  *      *
package Lecture_1_to_5.loops.pattern;

import java.util.Scanner;

public class patter11 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("entrn n :");
        int n = sc.nextInt();
        int count = n-1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int k = 2*count; k>0; k--){    // ya fir k = 2 * (n-i)  that is also equal to 2 * 3 = 6
                System.out.print(" ");
            } 
            count = count - 1;
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        int count2 =0;
        
        for(int i = n; i>=1; i--){

            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int k=0; k<count2; k++){
                System.out.print(" ");
            }
            count2 += 2;
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
