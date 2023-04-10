/* Split method Imlementation */
import java.util.*;
public class String3 {
  public static void main(String[]args){
    Scanner scn = new Scanner(System.in);
    String str = "Words1 @words 2$words3 #words4, cwords";
    //String[]arr = str.split("[@ $ # ,]");
    String[]arr = str.split("\\s");
    for(String x:arr){
        System.out.println(x);
    }
  }  
}
