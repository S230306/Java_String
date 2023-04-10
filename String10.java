/*Check the given String Pallindrome or not */
import java.util.*;
public class String10 {
    public static boolean Pallindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    } 
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.print(Pallindrome(str));
    }
}
