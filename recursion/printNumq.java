// print 1 to 5
package recursion;

import java.util.Scanner;

public class printNumq {


    public static void print(int n){

        // base case
        if(n == 0){
            return;
        }
        print(n-1);
        System.out.println(n);  // returning time print ho rah hai yeha 
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter n : ");
        int n = sc.nextInt();

        print(n);
        sc.close();
    }
}
