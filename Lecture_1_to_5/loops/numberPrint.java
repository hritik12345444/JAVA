//Q1. print 0 to 10
package Lecture_1_to_5.loops;

// public class numberPrint {
//     public static void main(String[] args){
//         for(int i =0; i<11; i++){
//             System.out.print(i + " ");
//         }
//     }
// }


//Q2. Print sum of first n natural number
import java.util.*;
public class numberPrint{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");  // jo input dalenge wo sc me store hota hai fir jake sc. krke kisi variable me store krte hai 

        int n = sc.nextInt();
        int sum = 0;
        for(int i= 1; i<=n; i++){
            sum += i;
        }

        System.out.println(sum);

        sc.close();
    }
}
