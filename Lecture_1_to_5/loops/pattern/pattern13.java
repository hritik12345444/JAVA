// pattern 13
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5 
package Lecture_1_to_5.loops.pattern;

import java.util.*;

public class pattern13 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter n : ");
        int n = sc.nextInt();

        for(int i= 1; i<=n;i++){
            for(int j=i; j<n; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
