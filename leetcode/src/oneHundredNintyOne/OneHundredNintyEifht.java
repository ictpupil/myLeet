package oneHundredNintyOne;

public class OneHundredNintyEifht {

	public static  int rob(int[] nums) {
        if(nums==null||nums.length==0)
        	return 0;
		int len = nums.length;
		if(len==1)
			return nums[0];
		else if(len==2)
			return Math.max(nums[0], nums[1]);
		int[] dp = new int[100000];
		dp[0] =  nums[0];
		dp[1] = nums[1];
		dp[2] = dp[0]+nums[2];
		for(int i=3;i<len;i++) {
			if(dp[i-3]>dp[i-2]) {
				dp[i] = dp[i-3]+nums[i];
				System.out.println("i-3:  "+i+" "+dp[i]+" "+dp[i-3]+" "+nums[i]);
			}else {
				dp[i] = dp[i-2]+nums[i];
				System.out.println("i-2:  "+i+" "+dp[i]+" "+dp[i-2]+" "+nums[i]);
			}
		}
		for(int i=0;i<len;i++) {
			System.out.print(dp[i] + " ");
		}
		if(dp[len-1]>dp[len-2])
			return dp[len-1];
		else
			return dp[len-2];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {6,6,4,8,4,3,3,10};
		System.out.println(rob(test));
		
	}

}
