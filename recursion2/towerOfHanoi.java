// Tower of Hanoi 
// RULES:
// 1. Only one disk trandfered in 1 step
// 2. Smaller disks are always kept on top of larger disks
package recursion2;

import java.util.Scanner;

public class towerOfHanoi {

    public static void towerOfhanoi(int n, String src, String helper, String dest){

        // base case
        if(n == 1){
            // System.out.println(n + " is transefere from " + src + " to " + dest);
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        towerOfhanoi(n-1, src, dest, helper);
        // System.out.println(n + " is transefere from " + src + " to " + dest);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        towerOfhanoi(n-1, helper, src, dest);
        return;
    }
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        towerOfhanoi(n,"S","H","D");

        sc.close();
    }
}


// logic important