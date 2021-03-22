import java.util.*;

class Program {

  public String tournamentWinner(
      ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results)
	{
		// Write your code here.
		int highScore = 0;
		String currentWinner = null;
		// hash map of team,score
		Map<String,Integer> scoreBoard = new HashMap<>();
		// go though the competitions and add each team to the hashmap. increase their score if nessacarry
		for(ArrayList<String> comp : competitions)
		{
			for(String team : comp)
			{
				if (scoreBoard.get(team)==null) scoreBoard.put(team,0);
				// check if the team won 
				if (results.get(competitions.indexOf(comp)) != comp.indexOf(team))
				{
					// if they did up their score
					scoreBoard.put(team, scoreBoard.get(team)+1);
					if(scoreBoard.get(team)>highScore) 
					{
						highScore = scoreBoard.get(team);
						currentWinner = team;
					}
				}
			}
		}
    return currentWinner;
  }
}

