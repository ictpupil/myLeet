package fiftyone;

public class FiftyThree {

	public int maxSubArray(int[] nums) {
        int temp = 0;
        int ans = nums[0];
        for(int i = 0;i<nums.length;i++){
            if(temp>0){
                temp += nums[i]; 
            }else{
                temp = nums[i];
                
            }
            if(ans<temp)
                    ans = temp;
        }
        return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
