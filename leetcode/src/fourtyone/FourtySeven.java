package fourtyone;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FourtySeven {

	public List<List<Integer>> permuteUnique(int[] nums){
		List<List<Integer>> ans = new ArrayList<>();
        int[] tmp = new int[nums.length];
        int[] vis = new int[nums.length];
        sol2(ans,nums,nums,0);
        return ans;
	}
	
	public void sol2(List<List<Integer>> ans,int[] tmp,int[] nums,int indexx) {
		if(indexx == nums.length) {
			List<Integer> tt = new ArrayList<>();
			for(int i = 0;i<nums.length;i++) {
				tt.add(nums[i]);
				//System.out.println(tt.size());
			}
			ans.add(tt);
		}
		for(int i=indexx;i<nums.length;i++) {
			if(isRepeat(nums,indexx,i)) {
				continue;
			}
			sswap(tmp,indexx,i);
			sol2(ans,tmp,nums,indexx+1);
			sswap(tmp,indexx,i);
		}
	}
	public boolean isRepeat(int[] nums,int st,int en) {
		int t = nums[en];
		for(int i = st;i<en;i++) {
			//System.out.println(nums[i]);
			if(nums[i] == t) {
				return true;
			}
		}
		return false;
	}
	public void sswap(int[] tmp,int a,int b) {
		/*tmp[a] = tmp[a]^tmp[b];
		tmp[b] = tmp[a]^tmp[b];
		tmp[a] = tmp[a]^tmp[b];
		*/
		int noww = tmp[a];
		tmp[a] = tmp[b];
		tmp[b] = noww;
	}
	
	public static void main(String[] args) {
		int[] numm = {1,1,3,4};
		//List<List<Integer>> anss = new FourtySix().permute(numm);
		List<List<Integer>> anss = new FourtySeven().permuteUnique(numm);
		Consumer action = System.out::print;
		for(List<Integer> ech: anss) {
			ech.forEach(action);
			System.out.println();
		}

	}

}
