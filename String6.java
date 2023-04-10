/*Write a Java program to concatenate two given strings. */
import java.util.*;
public class String6 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        String str1 = scn.next();
        String str2  = scn.next();
        String str3  = str1.concat(" ").concat(str2);
        System.out.println(str3);
    }
}
