/*Write a Java program to count the number of vowels in a given string. */
import java.util.*;
public class String11 {
    public static int countVowel(String str){
        int count = 0;
        for(int idx=0;idx<str.length();idx++){
            char ch  = str.charAt(idx);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'
            ||ch=='a'||ch=='e'||ch=='i'||ch=='O'||ch=='u'){
                count++;
            }
        }
        return count;
    }
   public static void main(String[]args){
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(countVowel(str));
   } 
}
