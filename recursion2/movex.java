package recursion2;

public class movex {


    public static void moveXToEnd(String str, int idx, int count , String newString){

        if(idx == str.length()){
            for(int i=0; i<count; i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar != 'x'){
            newString+=currChar;
            moveXToEnd(str,idx+1,count,newString);
        }else{
            count++;
            moveXToEnd(str,idx+1,count,newString);
        }

        return;

    }
    public static void main(String []args){
        String str = "axbcxxd";

        moveXToEnd(str,0,0,"");
        
    }
    
} 