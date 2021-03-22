import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    // Write your code here.
		int sPoint  = 0;
		for(int num : array){
			if (sequence.get(sPoint) == num){
				sPoint++;
					if(sPoint == sequence.size()){
						return true;
					}
			}
		}
    return false;
  }
}
