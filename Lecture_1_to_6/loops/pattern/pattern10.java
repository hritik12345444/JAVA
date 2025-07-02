// pattern 10
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
package Lecture_1_to_6.loops.pattern;

import java.util.Scanner;

public class pattern10 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            int k = 1; // normal k statring with 1
            if(i % 2== 0){  // jab i ka value even hoga to uss line ko 0 se start krana hahi
                k = 0;
            }
            for(int j=1; j<=i; j++){
                System.out.print(k + " ");
                // change k's value with 0 and 1 (agar k me 0 hai to use update krr do 1 se agar k me 1 hai to usse update krr do 0 se).
                if(k == 0 ){
                    k = 1;
                }else {
                    k = 0;
                }
                
            }
            System.out.println();
        }
        sc.close();
    }
}
