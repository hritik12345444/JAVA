// take 3 number check which is greater
package Lecture_1_to_5.conditional;

import java.util.Scanner;

public class checkGreater {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st no : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd no : ");
        int c = sc.nextInt();

        if(a > b){
            if(b > c){
                System.out.println("1st no. is greater");
            }else{
                System.out.println("1st no. is greter");
            }
        }else if(b > a){
            if(b > c){
                System.out.println("2nd no. is greter");
            }else{
                System.out.println("3rd no. is greter");
            }
        }
        sc.close();
    }

}