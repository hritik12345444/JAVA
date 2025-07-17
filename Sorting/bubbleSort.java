// bubble sort (compare two adjecent element and reorderd it)
package Sorting;

public class bubbleSort {

    // function for print array
    public static void printArr(int []arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        return;
    }

    public static void main(String []args){
        int []arr = {7,8,1,3,2};
        int n = arr.length;
        for(int i = 0; i<n; i++){
            for(int j =0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        printArr(arr);
    }
}
