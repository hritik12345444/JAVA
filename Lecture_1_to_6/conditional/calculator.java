//  Make a calculator. Take 2 number (a & b) from the user and an operations like + - * /
package Lecture_1_to_6.conditional;

import java.util.Scanner;

public class calculator {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("Enter a opertor : ");
        char ch = sc.next().charAt(0);  // phla word lo uska 0th character utha lo

        if(ch == '+'){
            System.out.println("Sum : "+(a + b));
        }else if (ch == '-'){
            System.out.println("Sub : "+(a - b));
        }
        else if (ch == '*'){
            System.out.println("Mul : "+(a*b));
        }else if(ch == '/'){
            System.out.println("Div : " + (a / b));
        }else if(ch == '%'){
            System.out.println("Modu : " + a % b);
        }else{
            System.out.println("Invalid operator ");
        }
        sc.close();
    }
}
