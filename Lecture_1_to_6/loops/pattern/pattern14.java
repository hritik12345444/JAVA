// pattern  14
//         1
//       2 1 2
//     3 2 1 2 3 
//   4 3 2 1 2 3 4 
// 5 4 3 2 1 2 3 4 5 
package Lecture_1_to_6.loops.pattern;

import java.util.*;

public class pattern14 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=2*(n-i); j++){    //agar j <= 2*(n-i) ye condition de to printing me single space print krane se kam chal jayega
                System.out.print(" ");        // agar printing me double space denge to j ka conditon change krna hoga like j <= (n-i) krna h
            }
            for(int j = i; j >= 2; j--){
                System.out.print(j + " ");
            }
            for(int j= 1;j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();

        }

        sc.close();
    }
}
