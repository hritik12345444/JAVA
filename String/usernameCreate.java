// input an email from the user. You have to cre4ate a username from the email by deleting the part that comes after '@'. Display that username to the user.
package String;

import java.util.Scanner;
public class usernameCreate {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a email : ");
        String email = sc.nextLine();
        String userName = "";
        for(int i=0; i<email.length(); i++){
            if(email.charAt(i) == '@'){
                System.out.println(userName);
                break;
            }else{
                userName = userName+email.charAt(i);
            }
        }
        sc.close();
    }
}
