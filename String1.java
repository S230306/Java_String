/*Split method */
import java.util.*;
public class String1{
    public static void main(String[]args){
     String str = "geeks@for@Geeks";
     String[]arr = str.split("@", 6);
     for(String x:arr){
        System.out.println(x);
     }
    }
}