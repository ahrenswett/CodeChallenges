import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
		Arrays.sort(array);/*this call is O(n log n)*/
		int pHigh = array.length -1;
		int pLow = 0;
		while(pHigh != pLow)
		{
			if(array[pHigh] + array[pLow] == targetSum)
			{
				int solution[] = {array[pLow],array[pHigh]};
				return solution;
			}
			if(array[pHigh] + array[pLow] > targetSum) pHigh --;
			if(array[pHigh] + array[pLow] < targetSum) pLow ++;
		}
		
    return new int[0];
  }
}
