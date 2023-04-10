/*Write a Java program to reverse a given string. */
import java.util.*;
public class String12 {
    public static String ReverseString(String str){
     String rev = "";
     for(int idx=str.length()-1;idx>=0;idx--){
        char ch = str.charAt(idx);
        rev+=ch;
       }
     return rev;
    }
   public static void main(String[]args){
    Scanner scn = new Scanner(System.in);
    String str  =  scn.next();
    System.out.print(ReverseString(str));
   } 
}
