/*Write a Java program to remove all the white spaces from a given string. */
import java.util.*;
public class String14 {
    public static String removeWhiteSpace(String str){
        String res = "";
        for(int idx=0;idx<str.length();idx++){
            char ch = str.charAt(idx);
            if(ch==' '){
                continue;
            }else{
                res+=ch;
            }
        }
        return res;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.print(removeWhiteSpace(str));
    }
}
