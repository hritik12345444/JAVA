// Write a java program to check if a number is a power of 2 using recursion (yessa number chahiye jo ki 2 ka kahi na kahi power ho ) like 64 => 2^6
package recursion2;

import java.util.Scanner;
public class powercheck {

    public static boolean checkpower(int n){
        if(n==0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%2==0){
            return checkpower(n/2);
        }else{
            return false;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter n : ");
        int n = sc.nextInt();

        boolean res = checkpower(n);
        System.out.println(res);
        sc.close();
    }
}
