// Print x^n (stack height = logn)
package recursion;

import java.util.*;
public class printPower2 {

    public static int power(int x, int n){
        
        // base case
        if(n==0){
            return 1;
        }

        if(n%2==0){
            return power(x, n/2) * power(x, n/2);
        }else{
            return power(x, n/2) * power(x, n/2) * x;
        }
        
    }
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int res = power(x,n);
        System.out.println(res);
        
        sc.close();
    }
    
}
