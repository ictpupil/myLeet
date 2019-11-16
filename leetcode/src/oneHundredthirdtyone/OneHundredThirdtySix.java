package oneHundredthirdtyone;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class OneHundredThirdtySix {

	public int singleNumber(int[] nums) {
		Set<Integer> sset = new HashSet<>();
		int len = nums.length;
		for(int i=0;i<len;i++) {
			if(sset.contains(nums[i])) {
				sset.remove(nums[i]);
			}
			sset.add(nums[i]);
		}
		int ans = 0;
		for(Iterator<Integer> it = sset.iterator();it.hasNext();) {
			ans = it.next();
		}
		return ans;
    }
	
	public int singleNumber2(int[] nums) {
		int len = nums.length;
		int ans = 0;
		for(int i=0;i<len;i++) {
			ans = ans^nums[i];
		}
		return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
