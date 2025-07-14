// String builder
// stirng builder me orginal string me changes krr skte hai. It is a mutable
// String is immutable
package StringBuilder;

public class stringbuilder {
    
    public static void main(String []args){
        // Declearation
        StringBuilder sb = new StringBuilder("Apna College");
        System.out.println(sb);



        // Get character from index
        StringBuilder sb2 = new StringBuilder("tonny");
        // set char
        sb2.setCharAt(0, 'p');



        // set a character at Index
        StringBuilder sb3 = new StringBuilder("Tony");
        // Get char
        sb3.setCharAt(0, 'a');  // this is important
        System.out.println(sb3);




        // Insert a Character at Some Index
        StringBuilder  ss = new StringBuilder("tony");
        // Insert char
        ss.insert(ss.length(), 's');
        System.out.println(ss);



        // Delete char at some Index
        StringBuilder sss = new StringBuilder("tony");
        // Insert char
        sss.insert(0,'s');
        System.out.println(sss);
        // delete char
        sss.delete(0, 3);
        System.out.println(sss);


        // Append a char (add at end)
        StringBuilder  s4 = new StringBuilder("tony");
        s4.append("hello");
        System.out.println(s4);



        // print length of string
        StringBuilder  s5 = new StringBuilder("tony");
        System.out.println(s5.length());

    }
}
