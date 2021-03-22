import java.util.*;

class Program {

  public int minimumWaitingTime(int[] queries) {
    // Write your code here.
		Arrays.sort(queries);
		//accumulates all wait times
		int minTime = 0;
		//wait time for each query to start
		int waitTime = 0;
		
        for(int i = 0; i < queries.length -1; i++)
		{
			//add last wait time plus current run time for next wait time
			waitTime = (waitTime + queries[i]);
			//add wait time to total
			minTime += waitTime;
		}
        
    return minTime;
  }
}