/*Write a function that takes two inputs - a string and a character
 to remove - and returns the string with all occurrences of the 
 character removed */
import java.util.*;
public class String15{
    public static String RemoveChar(String str,char k){
        String res="";
        for(int idx=0;idx<str.length();idx++){
            if(str.charAt(idx)==k){
                continue;
            }else{
                res+=str.charAt(idx);
            }
        }
        return res;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        char k = scn.next().charAt(0);
        System.out.print(RemoveChar(str,k));
    }
}