// multiply hmm log function lo calling function ke uper ya niche khi bhi likh skteha i
package Lecture_7_to_10;

import java.util.Scanner;

public class multiply {

    

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = sc.nextInt();

        System.out.println("Multiply is : " + multiplyOfTwoNums(num1,num2));
        sc.close();
    }  
    
    public static int multiplyOfTwoNums(int num1, int num2){
        return num1 * num2;
    }
}
