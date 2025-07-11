// Take an array of numbers as input and check if it is an array ssorted in ascending order.
package Lecture_7_to_10.array;

public class checksortedornot {
    public static void main(String []args){
        
        int []arr = {1,2,3,9,5};
        boolean isSorted = true;
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }

        if(isSorted == false){
            System.out.println("array is not sorted");

        }else{
            System.out.println("array is sorted");

        }
    }
}
