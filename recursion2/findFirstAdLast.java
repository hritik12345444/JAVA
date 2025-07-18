// Find first and last occurence of char in string using recursion
package recursion2;

import java.util.*;
public class findFirstAdLast {

    static int first = -1;
    static int last = -1;

    public static void firstANdLastOcc(String str, char ch, int i){


        // base case
        if(i == str.length()){
            return;
        }

        if(str.charAt(i) == ch){
            if(first == -1){
                first = i;
            }else{
                last = i;
            }
            
        }
        firstANdLastOcc(str,ch,i+1);

    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        System.out.print("Enter a char : ");
        char ch = sc.nextLine().charAt(0);

        

        firstANdLastOcc(str,ch, 0);
        System.out.println(first + " " + last);

        sc.close();
    }
}
