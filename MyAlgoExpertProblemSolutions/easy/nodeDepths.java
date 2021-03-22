import java.util.*;
class Program {

  public static int nodeDepths(BinaryTree root) {		
    return (nodeDepthSum(root.left, 0) + nodeDepthSum(root.right, 0));
  }
	
	static int nodeDepthSum(BinaryTree root, int depth){
		if (root == null) return 0;
		depth++;
		return (nodeDepthSum(root.left, depth) + nodeDepthSum(root.right, depth) + depth);	
	}

  static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }
}
