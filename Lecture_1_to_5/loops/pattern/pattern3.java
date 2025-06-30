// pattern3 
// ****
// *  *
// *  *
// *  *
// ****
package Lecture_1_to_5.loops.pattern;

import java.util.*;
public class pattern3 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<= n+1; j++){
                if(i == 1 || i == n || j == 1 || j == n+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
