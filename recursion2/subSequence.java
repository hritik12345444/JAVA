// Print all the subsequences of a string
package recursion2;
import java.util.HashSet;
public class subSequence {

    HashSet <String> set = new HashSet<>();
    public static void psubSequence(String str, int idx, String subSeq){
        
        // Base case
        if(idx == str.length()){
            System.out.println(subSeq);
            return;
        }
        char currChar= str.charAt(idx);
        // ek bar current charactor ko subseq me add kiye (to be added)
        psubSequence(str, idx+1, subSeq+currChar);

        // ek bar current charactor ko subseq me add nahi kiye (to not be added)
        psubSequence(str, idx+1, subSeq);

        return;
    }
    
    public static void main(String[]args){
        String str = "abc";
        psubSequence(str, 0, "");
    }
}
