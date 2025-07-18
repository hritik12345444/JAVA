// Check if an array is sorted (strictlyy increasing)  (means 1,2,3,4,5 is strictly sorted) but 1,2,3,3,4 is not strictly sorted
package recursion2;

public class arrIsSortedOrNot {

    // static boolean flag = false;
    public static boolean checkSorted(int[]arr, int i){

        if(i == arr.length-1){
            return true;
        }
        
        if(arr[i] < arr[i+1]){  // arr[i]  less than hai arr[i+1] se to hmm yeha return kiye hai agla call me jo reselt aaye usko return kiye hai 
            return checkSorted(arr, i+1);
        }else{
            return false;
        }
       

    }
    public static void main(String[] args) {
        int []arr = {1,2,3,3,15};

        boolean flag = checkSorted(arr,0);
        System.out.println(flag);
    }
}
