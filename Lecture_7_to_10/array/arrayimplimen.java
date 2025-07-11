package Lecture_7_to_10.array;

public class arrayimplimen{

    public static void main(String []args){
        int []arr = new int[5];  // this is most recomended in java to initialize a array
        int brr[] = {1,2,3,4,5,6}; // we can also declear array in  java.
        for(int i=0; i<brr.length; i++){
            System.out.print(brr[i] + " ");
        }
        System.out.println();
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
    }
}