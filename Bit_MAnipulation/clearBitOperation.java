// clear bit means change the specific bit to 0 even if it was 1 before.
// clear the 3rd bit (position = 2) of a number (n = 0101)
// task to be performed : 1 bit mask 2 AND with NOT
package Bit_MAnipulation;

public class clearBitOperation {
    public static void inBinaryPrint(int newNumber){
        // convert into binary number system

        String binary = Integer.toBinaryString(newNumber);  // string me hi likhana prega kyuki by defalut java usse decimal number smjh leta hai
        System.out.println(binary + " it is in binary ");

    }
    public static void main(String []args){

        int n = 5;   // in binary 0101 => 0001
        int pos = 2;

        int bitMask = 1 << pos;  /// it is permanent in every manipulation
        int newBitMask = ~(bitMask);  // Here NOT operation performed
        int newNumber = newBitMask & n;   // newBitMask and n ka AND nikale hai 
        System.out.println(newNumber);  // display after clear a bit

        // dispay in binary 
        inBinaryPrint(newNumber);


    }    
}
