// insertion sort 
package Sorting;

public class insertionSort {

    public static void printArr(int[]arr){
        int n= arr.length;
        for(int i=0;i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String []args){
        int []arr =  {7,8,1,3,2};
        int n = arr.length;

        for(int i=1; i<n; i++){
            int j = i;
            while( j > 0  && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

       printArr(arr);
    }    
}
