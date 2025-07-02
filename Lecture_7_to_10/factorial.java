// factorial of a number 
package Lecture_7_to_10;

import java.util.Scanner;

public class factorial {
    public static int factorialOfNum(int num){
        int res =1;
        for(int i=1; i<=num; i++){
            res *= i;
        }
        return res;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num : ");
        int num = sc.nextInt();

        int fact = factorialOfNum(num);
        System.out.println("factorial : " + fact);
        sc.close();
    }
}
