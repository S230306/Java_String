/*Write a Java program to check if a given string is a palindrome or not. */
import java.util.*;
public class String9 {
    public static boolean Pallindrome(String str){
        String rev = "";
        for(int idx=str.length()-1;idx>=0;idx--){
            char ch = str.charAt(idx);
            rev+=ch;
        }
        if(str.equals(rev)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[]args){
       Scanner scn = new Scanner(System.in);
       String str = scn.next();
       System.out.println(Pallindrome(str));
    }
}
