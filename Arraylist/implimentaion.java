package Arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class implimentaion {
    public static void main(String []args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list2 = new ArrayList<String>();

        // Add elements
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // particular index per element add kr skte hai
        list.add(1,33);
        System.out.println(list);


        // remove elements yeha index chalta hai array ki trh
        list.remove(0);
        System.out.println(list);


        // Remoce everything from list
        // list.clear();
        // System.out.println(list);


        // kisi index ka value print krne ke liye
       int val =  list.get(2);
       System.out.println(val);

       // return last element from list
       System.out.println(list.getLast());
       System.out.println(list);

       // check list is empty or not 
       if(!list.isEmpty()){
            System.out.println("list is not empty");
       }


       // update value in the list
       list.set(0, 22);
       System.out.println(list);


       // return the size() of list 
       System.out.println(list.size());

       // print all element from the list using for loop
       for(int i =0; i<list.size(); i++){
            System.out.println(list.get(i) + " :-> element in the list");
       }
       System.out.println();


       // Sorting (in java there is inbuilt function for sort using collections class phle isse import krna hota hai)
       Collections.sort(list);
       System.out.println(list);

    }
}
