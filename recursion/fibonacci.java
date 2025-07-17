// print the fibonacci sequence till nth term
package recursion;

import java.util.Scanner;

public class fibonacci {

    // return fibonacci number of every ith position
    public static int fibo(int n){
        if(n <= 1){
            return 1;
        }
        return fibo(n-1) + fibo(n-2);
    }

    
    public static void fibonacciSeries(int n){

        // ek eke krr ke fibonacci number laa rhe hai 
        for(int i = 0; i<n; i++){
            System.out.print(fibo(i) + " " );
        }
    }
    
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("enter n : ");
        int n = sc.nextInt();

        fibonacciSeries(n);
        sc.close();
    }
}