// Pattern 4 
// for n = 4 
// *
// **
// ***
// ****
package Lecture_1_to_6.loops.pattern;

import java.util.Scanner;

public class pattern4 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i= 1; i<=n; i++){
            for(int j= 1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }


        sc.close();
    }
}
