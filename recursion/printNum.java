// print numbers from 5 to 1
package recursion;

import java.util.Scanner;

public class printNum {

    // recursion
    public static void print(int n){
        
        // base case
        if(n == 0){
            return;
        }

        System.out.println(n);
        print(n-1);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        print(n);


        sc.close();
    }
}
