// Write a program to calculate the sum of digits of a number using recursion.
package recursion;

public class sumOfDigit1{
    public static int sumOfD(int n){

        if(n==0){
            return 0;
        }

        return sumOfD(n/10) + n%10;
    }
    public static void main(String []args){
        int n = 12345;
        int res = sumOfD(n);
        System.out.println(res);;
    }
}