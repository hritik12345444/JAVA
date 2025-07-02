package Lecture_7_to_10;

import java.util.Scanner;

public class practice {

    public static int sumOfOdd(int n){
        int sum=0;
        for(int i=1; i<=n; i+=2){
            sum+=i;
        }
        return sum;
    }
    public static int greatest(int n, int n2){
        if(n > n2){
            return n;
        }else{
            return n2;
        }
    }
    public static boolean vote(int age){
        if(age >= 18){
            return true;
        }else{
            return false;
        }
    }
    public static void infinitiLoop(int n){
        do{
            System.out.println("Hello");;
        }while(n >3);
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter n1 : ");
        int n = sc.nextInt();
        // System.out.println("enter num2 : ");
        // int n2 = sc.nextInt();
        // System.out.println("enter age : ");
        // int age = sc.nextInt();
        // System.out.println(vote(age));
        // infinitiLoop(n);

        sc.close();
    }
}
