import java.util.*;

class Program {

  public boolean classPhotos(
      ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
// 		sort the Arraylists
		Collections.sort(redShirtHeights);
		Collections.sort(blueShirtHeights);
    
// 		check if red shirts are taller
		if(redShirtHeights.get(0) > blueShirtHeights.get(0))
		{
				for(int i = 0; i < redShirtHeights.size(); i++)
			{
				if (redShirtHeights.get(i) == blueShirtHeights.get(i) ||
						redShirtHeights.get(i) < blueShirtHeights.get(i))
				{
					return false;
				}
			}
			return true;
		}
// 		check if blue shirts are taller
		if(blueShirtHeights.get(0) > redShirtHeights.get(0))
		{
				for(int i = 0; i < redShirtHeights.size(); i++)
			{
				if (redShirtHeights.get(i) == blueShirtHeights.get(i) ||
						redShirtHeights.get(i) > blueShirtHeights.get(i))
				{
					return false;
				}	
			}
			return true;
		}
		
		return false;
  }
}
