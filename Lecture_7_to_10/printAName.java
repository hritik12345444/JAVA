// Print a given name in a function
package Lecture_7_to_10;
import java.util.Scanner;
public class printAName {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name : ");
        String name = sc.nextLine();

        System.out.println("This is your name : " + name);
        sc.close();
    }
}
