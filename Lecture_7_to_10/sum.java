// Make a function to add 2 numbers and return the sum.
package Lecture_7_to_10;
import java.util.Scanner;
public class sum {

    public static int sumOfTwoNums(int n1, int n2){
        return n1 + n2;
    }
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();

        // int res = sumOfTwoNums(num1,num2);
        System.out.println("Sum is : " + sumOfTwoNums(num1,num2));   // both are allowed
        sc.close();
        

    }
}
