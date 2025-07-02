// check for vote
package Lecture_1_to_6.conditional;

import java.util.*;   // or import java.util.scanner

public class canVote {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");

        int age = sc.nextInt();   // sc.nextInt means take in input in integer value
        if(age >= 18 && age < 98){
            System.out.println("Yes you can vote");
        }else if(age > 90){
            System.out.print("You are not a human ");
        }else{
            System.out.println("You can't vote");
        }
        sc.close();   // This is important to close sc after work finished
    }
}
