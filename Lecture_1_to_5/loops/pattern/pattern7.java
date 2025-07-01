// pattern 7
// 1
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5
package Lecture_1_to_5.loops.pattern;

import java.util.Scanner;

public class pattern7 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i= 1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
