// Find the 1st & last occurance of an element in string
package recursion2;

import java.util.Scanner;

public class firstAndLastOccr {

    public static int[] findFirstAndLastOccurence(String str  , char ch){

        int []arr={-1,-1};
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) == ch){
                arr[0] = i;
                break;  // iske wajah se arr[0] per first occurence store krr rhe hai
            }
        }
        for(int j = str.length()-1; j>=0; j--){
            if(str.charAt(j) == ch){
                arr[1] = j;
                break;  // iske wajah se arr[1] per last occurence store krr rhe hai
            }
        }

        return arr;
    }
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        System.out.print("enter a ch ");
        char ch = sc.nextLine().charAt(0);

        int [] res = findFirstAndLastOccurence(str, ch);
        System.out.println(res[0] + " " + res[1]);


        sc.close();
    }
}
