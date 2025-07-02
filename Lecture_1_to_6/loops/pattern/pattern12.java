// pattern 12
//     *****
//    *****
//   *****
//  *****
// *****
package Lecture_1_to_6.loops.pattern;

import java.util.*;

public class pattern12 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter n : ");
        int n = sc.nextInt();

        for(int i= n; i>=1; i--){
            for(int j=1;j<i; j++){
                System.err.print(" ");
            }
            for(int j= 1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        sc.close();
    }
}
