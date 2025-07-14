//Input a string from the user. Create a new string called 'result' in which you will replace the letter 'e' in the original string with letter 'i'.
// String st = str.replace("h", "x")  this is a funcion for replace a from string and return a new string
package StringBuilder;


import java.util.Scanner;
public class inputString {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string : ");
        String str = sc.nextLine();

        // convert str into StringBuilder
        StringBuilder sb = new StringBuilder(str);

        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i) == 'e'){
                sb.setCharAt(i, 'i');
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
