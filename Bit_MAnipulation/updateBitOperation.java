// Update bit changing a specific bit to 1 or 0 
// update the 2nd bit (position = 1) of a number n (n = 0101)

package Bit_MAnipulation;
import java.util.Scanner;

public class updateBitOperation {

    public static void toBinaryPrint(int n ){

        // print in binary
        String binary = Integer.toBinaryString(n);
        System.out.println(binary + " : it is in binary ");
    }
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter pos : ");
        int n  = 5;
        int pos = sc.nextInt();
        System.out.print("enter update value(0/1) : ");

        int updVal = sc.nextInt();

        if(updVal == 0){
            // clear bit operation to be performed

            int bitMask = 1 << pos;
            int newBintMask = ~(bitMask);
            int newNumber = newBintMask & n;
            System.out.println(newNumber);

            // funtion to print into binary
            toBinaryPrint(newNumber);
        }else{
            // set bit operation to be performed

            int bitMask = 1 << pos;
            int newNumber = bitMask | n;

            System.out.println(newNumber);

            // function to print in binary
            toBinaryPrint(newNumber);

        }

        sc.close();
    }
}