// pattern 9
// 1
// 2 3 
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
package Lecture_1_to_6.loops.pattern;

import java.util.Scanner;

public class pattern9 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n= sc.nextInt();
        int j=1;
        for(int i= 1; i<=n; i++){
            int k =1;
            while(k<=i){
                System.out.print(j + " ");
                j++;
                k++;
            }
            System.out.println();
        }
        sc.close();
    }
}
