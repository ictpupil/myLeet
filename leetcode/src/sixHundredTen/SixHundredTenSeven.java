package sixHundredTen;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class SixHundredTenSeven {

	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if(t1!=null&&t2!=null) {
			t1.val = t1.val+t2.val;
			t1.left = mergeTrees(t1.left,t2.left);
			t1.right = mergeTrees(t1.right,t2.right);
			return t1;
		}else if(t1==null) {
			return t2;
		}else {
			return t1;
		}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
