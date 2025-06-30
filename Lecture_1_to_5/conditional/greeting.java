// print the greeting
package Lecture_1_to_5.conditional;

import java.util.Scanner;

public class greeting {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose color (R-Red, G-Green,B-Blue) : ");
        char ch = sc.next().charAt(0);  // kisi word ka first character
        switch (ch) {
            case 'R':
                System.err.println("Hello");
                break;
            case 'G' :
                System.out.println("Namaste");
                break;
            case 'B' :
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid color");
        }
        sc.close();
    }  
}
