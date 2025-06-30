// print table with using loop
package Lecture_1_to_5;

import java.util.Scanner;  

public class table {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Whose tale : ");
        int tabl = sc.nextInt(); // integer input

        System.out.println(tabl * 1);
        System.out.println(tabl * 2);
        System.out.println(tabl * 3);
        System.out.println(tabl * 4);
        System.out.println(tabl * 5);
        System.out.println(tabl * 6);
        System.out.println(tabl * 7);
        System.out.println(tabl * 8);
        System.out.println(tabl * 9);
        System.out.println(tabl * 10);
        sc.close();
    }
}
