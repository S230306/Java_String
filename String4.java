/*Split Method */
import java.util.*;
public class String4 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        String str = "anisha@rawat@singh@pay@valueablecost";
        String[]arr = str.split("@",6);
        for(String x:arr){
            System.out.println(x);
        }
        String str1 = "anisah,rawata@pea&ani shaan";
        String[]arr1 = str.split("[@ $ # ,]");
        for(String x:arr1){System.out.println(x);}
    }
}
