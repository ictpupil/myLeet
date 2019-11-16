package oneHundredOne;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}


public class OneHundredFour {

	public int maxDepth(TreeNode root) {
		if(root==null)
			return 0;
		else if(root.left==null&&root.right==null)
			return 1;
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
