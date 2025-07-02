// // pattern 15
//    *        
//   ***     
//  *****    
// *******   
//  *****   
//   ***   
//    *
package Lecture_1_to_6.loops.pattern;

import java.util.Scanner;

public class pattern15 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int star = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=star; j++){
                System.out.print("*");
            }
            star+=2;
            System.out.println();
        }

        int star2 = (n*2)-3;   // 2nd half me star for every n starting with n*2 - 3= 8-3 = 5
        for(int i= 1; i<=n-1; i++){
            for(int j =1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=star2; j++){
                System.out.print("*");
            }
            star2-=2;

            System.out.println();
        }

        sc.close();
    }
}
