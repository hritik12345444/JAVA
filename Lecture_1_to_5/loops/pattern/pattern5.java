//pattern 5
package Lecture_1_to_5.loops.pattern;

import java.util.Scanner;

public class pattern5 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i = n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
