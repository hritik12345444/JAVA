// Print factorial of a number n 
package recursion;


import java.util.Scanner;
public class factorialofN {

    static int fact = 1;
    public static int factorial(int n){

        if(n == 1 || n == 0){
            return 1;
        }
        fact *= n;
        factorial(n-1);
        return fact;
    }

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int res = factorial(n);
        System.out.println(res);
        sc.close();
    }
}
