// Print x^n (stack height =n)
package recursion;

import java.util.Scanner;
public class printpower {

    public static int power(int x, int n){

        // base case
        if(n == 0){
            return 1;
        }

        return power(x, n-1) * x;
    }
    
    public static void main(String []args){


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x :  ");
        int x = sc.nextInt();
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int res = power(x,n);
        System.out.println(res);
        sc.close();
    }
}
