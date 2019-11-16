package fourtyone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FourtySix {

	public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        int[] vis = new int[nums.length];
        sol(ans,tmp,vis,nums);
        for(int i:tmp) {
        	System.out.print(i);
        }
        System.out.println(tmp.size());
        return ans;
    }
	
	public void sol(List<List<Integer>> ans,List<Integer> tmp,int[] vis,int[] nums) {
		if(tmp.size() == nums.length)
			ans.add(new ArrayList<>(tmp));
		for(int i = 0;i<nums.length;i++) {
			if(vis[i] == 1)
				continue;
			vis[i] = 1;
			tmp.add(nums[i]);
			sol(ans,tmp,vis,nums);
			vis[i] = 0;
			tmp.remove(tmp.size()-1);
		}
	}
	
//½»»»
	public List<List<Integer>> permute2(int[] nums){
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
				System.out.println(tt.size());
			}
			ans.add(tt);
		}
		for(int i=indexx;i<nums.length;i++) {
			
			sswap(tmp,indexx,i);
			sol2(ans,tmp,nums,indexx+1);
			sswap(tmp,indexx,i);
		}
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
		List<List<Integer>> anss = new FourtySix().permute2(numm);
		Consumer action = System.out::print;
		for(List<Integer> ech: anss) {
			ech.forEach(action);
			System.out.println();
		}
	}

}
