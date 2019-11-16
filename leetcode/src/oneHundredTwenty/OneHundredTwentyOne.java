package oneHundredTwenty;

public class OneHundredTwentyOne {

	
	public int maxProfit(int[] prices) {
        if(prices==null||prices.length==0)
        	return 0;
        int len = prices.length;
        int minn = prices[0];
        int ans = 0;
        for(int i=0;i<len;i++) {
        	if(prices[i]-minn>ans) {
        		ans = prices[i]-minn;
        	}
        	if(prices[i]<minn) {
        		minn = prices[i];
        	}
        }
        return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
