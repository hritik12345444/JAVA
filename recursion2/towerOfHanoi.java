// Tower of Hanoi 
// RULES:
// 1. Only one disk trandfered in 1 step
// 2. Smaller disks are always kept on top of larger disks

// Explanation : isme sorce se (n-1) disk ko helper pe bhejh diya jata hai . Uske badh jo ek disk bacha hua hai sorce per usse direct sorce to destion dall diya jata hai . Aur fir jo helper tha usepe abhi n-1 disk hai to abb helper ko as a sorce mann lenge aur sorce ko as a helper mann lenge fir heper to source n-1 disk ko bhejh denge fir helper per 1 disk bach hoga usee direct distination per bhejh deng . (Jab ek hi disk ho to hmm jada kuch nhi krte hai bss direct sorce to destination per transfer krr dete hai).
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