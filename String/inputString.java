//Input a string from the user. Create a new string called 'result' in which you will replace the letter 'e' in the original string with letter 'i'.
// String st = str.replace("h", "x")  this is a funcion for replace a from string and return a new string
package String;

import java.util.Scanner;
public class inputString {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        String newString = str.replace("e", "i");
        str = newString;      /// update original string
        System.out.println(str);
        // System.out.println(newString);

        sc.close();
    }
}
