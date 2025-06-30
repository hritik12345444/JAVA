//Enter the number of the month & print the name of the month. For eg - for 1 print january so on..
package Lecture_1_to_5.conditional;

import java.util.*;

public class month {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter no. of months : ");
        int num = sc.nextInt();

        switch (num){
            case 1 :
                System.out.println("January");
                break;
            case 2 :
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.err.println("April");
                break;
            case 5:
                System.err.println("May");
                break;
            case 6 :
                System.out.println("June");
                break;
            case 7:
                System.err.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.err.println("September");
                break;
            case 10:
                System.err.println("October");
                break;
            case 11:
                System.err.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.err.println("Invalid input");

            }
            sc.close();
    }
}
