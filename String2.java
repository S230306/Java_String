/*Split method */
import java.util.*;
public class String2 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        String str = "Geeks for #geeks";
        // using regular expression
        String[]arr = str.split("//s");
        for(String s:arr){
            System.out.println(s);
        }
        // String str1 = "Geeks#forGeeks#rgkls#flsmmf";
        // String[]arr1 = str1.split("#",4);
        // for(String s1:arr1){
        //     System.out.println(s1);
        // }
    }
}
