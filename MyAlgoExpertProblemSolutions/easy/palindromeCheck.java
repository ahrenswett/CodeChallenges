import java.util.*;

class Program {
  public static boolean isPalindrome(String str) {
    // Write your code here.
        if (str.length()==1) return true;
        // if index is the same or char is the same continue
        int left = 0;
        int right = str.length()-1;
        
        while(left <= right && str.charAt(left)==str.charAt(right)){
            left++;
            right--;
            if (left == right || left+1 == right){
                return true;
            }
            
        } 
        
    return false;
  }
}
