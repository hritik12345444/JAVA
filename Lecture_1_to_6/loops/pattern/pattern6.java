// pattern 6
//     *
//    **
//   ***
//  ****  
package Lecture_1_to_6.loops.pattern;

import java.util.Scanner;

public class pattern6 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter n : ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j=1; j<= (n-i); j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}