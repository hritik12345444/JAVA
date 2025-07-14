// reverse string using string builder(beacause we can change in original string)
package StringBuilder;


import java.util.Scanner;
public class reverseStringusingStringBuilder {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.print("enter string : ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);
        
        for(int i = 0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i; 

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);  // original string me update krr diye hai
            sb.setCharAt(back, frontChar); // original string me update krr diye hai
        }

        System.out.println(sb);
        sc.close();
    }
}
