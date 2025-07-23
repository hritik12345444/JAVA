// Remove duplicates in a string
package recursion2;
import java.util.Scanner;

public class removeDup {

    static int[]arr = new int[26];  // static array for track the which value is duplicate or original

    public static void removeDuplicates(String str,int i, String newStr){

        // Base case
        if(i == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(i);
        int arrIdx = currChar - 'a';  // array ka uss index ko find krega jo currchar ka occurence store hoga

        if(arr[arrIdx] == 0){
            newStr += currChar;
            arr[arrIdx]++;
            removeDuplicates(str, i+1, newStr);

        }else{
            removeDuplicates(str, i+1, newStr);
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string for remvoe duplicates :-  ");
        String str = sc.nextLine();
        // String str = "abbccda";

        removeDuplicates(str,0, "");

        sc.close();
    }   
}
