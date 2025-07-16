// get bit means check the git that is 1 or 0 at position

// Q Get the 3rd bit (position = 2) of a number n. (n= 0101  => )
/// positio count from right to left with zero based indexing
package Bit_MAnipulation;

public class getBitOperation {
    
    public static void main(String[]args){
        int position = 2;
        int n = 5;   // in binary number = 0101   here pos = 2 , the value is 1
        int BitMask = 1 << position;   // one ko left shift by position

        int opr = BitMask & n;    // AND operation perform krna hai yeha for check find output is zero or one
        if(opr == 0){
            System.out.println("the number is at pos : " + position + " is zero");

        }else{
            System.out.println("the number is at pos : " + position + " is one");
        }
    }
}