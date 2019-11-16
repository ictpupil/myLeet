package oneToTen;

import java.util.HashMap;
import java.util.Map;

public class one {

	public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mapp = new HashMap<>();
        int[] ans = new int[3];
        for(int i=0;i<nums.length;i++) {
        	int jiantar = target - nums[i];
        	if(mapp.containsKey(jiantar)) {
        		ans[0] = mapp.get(jiantar);
        		ans[1] = i;
        		return ans;
        	}
        	mapp.put(nums[i], i);
        }
        return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
