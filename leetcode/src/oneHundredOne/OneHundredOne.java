package oneHundredOne;



public class OneHundredOne {

	public boolean isSymmetric(TreeNode root) {
		if(root==null)return true;
        return sol(root.left,root.right);
    }
	
	public static boolean sol(TreeNode le,TreeNode ri) {
		if(le==null&&ri==null)
			return true;
		else if(le==null||ri==null)
			return false;
		return (le.val==ri.val)&&sol(le.left,ri.right)&&sol(le.right,ri.left);
	}
	
	public static void main(String[] args) {
		
	}

}
