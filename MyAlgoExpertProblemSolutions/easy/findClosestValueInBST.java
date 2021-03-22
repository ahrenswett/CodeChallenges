import java.util.*;

class Program {
	
	static HashMap<Integer, Integer> distanceFromTarget = new HashMap<>();
	
	
  public static int findClosestValueInBst(BST tree, int target) {
    // Write your code here.
		int shortestDistance = Integer.MAX_VALUE;
		if (tree != null){
			
			int distance = Math.abs(tree.value - target);
			System.out.println("Current value: " + tree.value 
												 + ",  Current target: " + target 
												 + ",  Distance between" + distance);
			
			if(distance < shortestDistance)
			{
				shortestDistance = distance;
				distanceFromTarget.put(distance, tree.value);
			}
			int left = findClosestValueInBst(tree.left, target, shortestDistance);
			int right = findClosestValueInBst(tree.right, target, shortestDistance);
			
			if (shortestDistance > left) shortestDistance = left;	
			if (shortestDistance > right) shortestDistance = right;	
		}
    return distanceFromTarget.get(shortestDistance);
  }
	
	
	public static int findClosestValueInBst(BST tree, int target,int shortestDistance){
		if (tree != null){
			
			int distance = Math.abs(tree.value - target);
			System.out.println("Current value: " + tree.value 
												 + ",  Current target: " + target 
												 + ",  Distance between" + distance);
			
			if(distance < shortestDistance)
			{
				shortestDistance = distance;
				distanceFromTarget.put(distance, tree.value);
			}
			int left = findClosestValueInBst(tree.left, target, shortestDistance);
			int right = findClosestValueInBst(tree.right, target, shortestDistance);
			
			if (shortestDistance > left) shortestDistance = left;	
			if (shortestDistance > right) shortestDistance = right;
		}
		return shortestDistance;
	}

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}

