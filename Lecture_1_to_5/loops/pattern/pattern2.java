// pattern 2
package Lecture_1_to_5.loops.pattern;

import java.util.*;

public class pattern2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n : ");

        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=n ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    } 
}