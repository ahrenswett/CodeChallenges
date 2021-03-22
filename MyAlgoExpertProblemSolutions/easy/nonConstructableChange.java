import java.util.*;

class Program {

  public int nonConstructibleChange(int[] coins) {
    // Write your code here.
		Arrays.sort(coins);
		int change = 0;
		for(int i=0; i < coins.length; i++){
			if(change+1 < coins[i]) return change+1;
			change += coins[i];
			if(i == coins.length-1) return change+1;
		}
    return 1;
  }
}
