// print table

package Lecture_1_to_5.loops;

import java.util.*;

public class tableOfNo {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.. : ");

        int num = sc.nextInt();
        for(int i= 1; i<=10; i++){
            System.out.println(num + " * " + i +" = " + (num*i));
        }
        sc.close();
    }
}
