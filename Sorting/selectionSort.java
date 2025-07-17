// Selection sort 
package Sorting;


public class selectionSort {

    public static void printArr(int []arr){

        int n= arr.length;
        for(int i=0;i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String []args){
        int []arr = {7,8,1,3,2};
        int n = arr.length;
        
        //selection sort
        for(int i=0; i<n; i++){
            int smaIdx = i;
            for(int j= i; j<n; j++){
                if(arr[j] < arr[smaIdx]){
                    smaIdx = j;
                }
            }

            // swap arr[smaIdx]  and arr[i]
            int temp = arr[smaIdx];
            arr[smaIdx] = arr[i];
            arr[i] = temp;
        }


        printArr(arr);

        
    }    
}
