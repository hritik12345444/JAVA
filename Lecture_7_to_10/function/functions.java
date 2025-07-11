package Lecture_7_to_10.function;

import java.util.Scanner;

public class functions {


    public static void printName(String name){
        System.out.println(name);
        return;
    }

    public static int sum(int a , int b){
        return a+b;
    }

    public static void factorialOfNum(int n){
        int res = 1;
        for(int i = 1; i<=n; i++){
            res *= i;
        }
        System.out.println(res);
        return;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        printName(name);
        int res = sum(20,30);
        System.out.println(res);
        factorialOfNum(5);
        sc.close();
    }
    
}
