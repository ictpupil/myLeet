package seventyone;

import java.util.ArrayList;
import java.util.List;

public class SeventyEight {

	public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        sol(0,ans,new ArrayList<>(),nums);
        return ans;
    }
	
	public void sol(int indexx,List<List<Integer>> ans,List<Integer> tmp,int[] nums) {
		ans.add(new ArrayList<>(tmp));
		for(int i = indexx;i<nums.length;i++) {
			tmp.add(nums[i]);
			sol(i+1,ans,tmp,nums);
			tmp.remove(tmp.size()-1);
			//sol(indexx+1,ans,tmp,nums);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
