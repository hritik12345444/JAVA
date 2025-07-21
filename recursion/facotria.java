// factorial of a number
package recursion;

import java.util.Scanner;


public class facotria {

    public static int factorial(int n){

        if(n==1 || n==0){
            return 1;
        }
        return factorial(n-1) * n;
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a n : ");
    int n= sc.nextInt();

    int res = factorial(n);

    System.out.println(res);
    sc.close();
   } 
}
