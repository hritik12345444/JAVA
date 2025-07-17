// print sum of first n natural numbers
package recursion;

import java.util.Scanner;
public class sumOfNatur {

    static int sum = 0;
    public static void sumOfNatural(int n){

        if(n==0){
            System.out.println("sum of first n natural number is : " + sum);
            return;
        }
        sum = sum + n;
        sumOfNatural(n-1);
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        sumOfNatural(n);
        sc.close();
    }
}
