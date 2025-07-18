// print a string in reverse
package recursion2;

import java.util.Scanner;

public class printStringReverse {

    
    public static void reverseString(String str, int i){


        if(i == str.length()){
            // System.out.println(str.charAt(i));
            return;
        }
       reverseString(str, i+1);   // i++ nhi likha hai i+1 likhna hai next call ke liye i ko 1 se badha krr dena hai
       System.out.println(str.charAt(i));
       return;
        
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        reverseString(str, 0);
        sc.close();
    }
}
