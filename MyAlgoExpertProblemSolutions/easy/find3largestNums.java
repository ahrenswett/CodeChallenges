import java.util.*;

class Program {
  public static int[] findThreeLargestNumbers(int[] array) {
    // Write your code here.
		int[] answer = {Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE};
		int holder;
		int holder1;
		for(int curInt : array){
			if (answer[2] < curInt){
				holder1 = answer[2];
				holder = answer[1]; 
				answer[2] = curInt;
				answer[1] = holder1;
				answer[0] = holder;
				}
			else if(answer[1] < curInt){
				holder = answer[1]; 
				answer[1] = curInt;
				answer[0] = holder;
				}
			else if(answer[0] < curInt){
				answer[0] = curInt;
				}
		}
    return answer;
  }
}
