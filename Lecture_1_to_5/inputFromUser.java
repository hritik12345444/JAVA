// take input from user
package Lecture_1_to_5;

import java.util.Scanner;  // input lene ke liye scanner ko import krna prta hai

public class inputFromUser {
    public static void main(String[] args){
        // jo bhi input dete hai wo sc object me aata hai phle fir use hmmm kisi variable me store krte hai iss trh se
        Scanner sc = new Scanner(System.in);   // scanner object bnaye input lene ke liye bnana prta hai

        System.out.print("Enter a sentence : ");  // print hoga enter your name
        String sentence = sc.nextLine();    // poora line input ke liye (including spaces)

        System.out.print("enter your name : ");
        String name = sc.next(); // ek word lega (space se phle tkk)

        System.out.print("enter your age : ");
        int age = sc.nextInt();  // integer input

        System.out.print("Enter your percentage : ");
        double per = sc.nextDouble();   // float / double input

        System.out.println(per);   // println -> print krne ke badh ek next line de dena hai

        System.out.println(sentence);
        System.out.println("hello "+ name + ", your age is "+ age);
        sc.close();
    }
}

// input lene ke liye phle import krna hoga java.util.scanner ko
// fir ek scanner ka object bnana hoga like scanner sc = new scanner (system.in)
// sc.nextLine()  --> pura line input ke liye (including spaces)
// sc.next()  --> ek word (space se phle tak)
// sc.nextInt() --> integer input
// sc.nextDouble() --> double/float input
