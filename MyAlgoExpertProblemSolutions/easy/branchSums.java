
import java.util.*;

class Program {
  // This is the class of the input root. Do not edit it.
  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }

  public static List<Integer> branchSums(BinaryTree root) 
	{
		List<Integer> sums = new ArrayList<Integer>();
		int accumulator = 0;
		return branchSums(root,accumulator,sums);
  }
	
	static List<Integer> branchSums(BinaryTree root, int accumulator, List<Integer> sums)
	{
		if(root != null)
		{
			accumulator += root.value;
			if(root.left == null && root.right == null)
			{
				sums.add(accumulator);
				return sums;
			}
			branchSums(root.left,accumulator,sums);
			branchSums(root.right,accumulator,sums);
		}
		return sums;
	}
}