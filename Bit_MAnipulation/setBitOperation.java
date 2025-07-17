// Set bit means changing the value of a particular bit in a number to 1 , using bitwise operations  (0 ko 1 krrna hai kisi particular position per)

// Q Set the 2nd bit (position =1) of a number n (n = 0101)

package Bit_MAnipulation;

public class setBitOperation {
    public static void main(String[]args){

        int n = 5 ; // in binary = 0101 
        int pos = 1;
        int BitMask = 1 << pos;  // 0001 << 1 => 0010 
        int newNumber = BitMask | n;    // position in n is set by 1

        System.out.println(newNumber);

    }    
}
