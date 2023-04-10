/*Write a Java program to find the first non-repeated character
  in a given string. */
import java.util.*;
public class String13 {
    public static char NonRepeatChar(String str){
        int[]freq = new int[122];
        for(int idx=0;idx<str.length();idx++){
            char ch = str.charAt(idx);
            freq[ch]++;
        }
        for(int idx=0;idx<str.length();idx++){
            char ch = str.charAt(idx);
            if(freq[ch]==1){
                return ch;
            }
        }
        return 'N';
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.print(NonRepeatChar(str));
    }
}
