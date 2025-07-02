// 1. pattern
package Lecture_1_to_6.loops.pattern;

import java.util.*;
public class pattern {
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n : ");

        int n = sc.nextInt();

        for(int i= 1; i<=n; i++){
            for(int j = 0 ; j<i; j++){
                System.err.print(" * ");
            }
            System.out.println();
        }
        sc.close();
        
    }
}
