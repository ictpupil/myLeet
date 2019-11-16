package sixtyone;

public class seventy {

	public static int climbStairs(int n) {
        if(n==1||n==2) 
        	return n;
        int a=1,b=2;
		while(n--!=2) {
			b+=a;
			a=b-a;
		}
		return b;
    }
	
	public static void main(String[] args) {
		System.out.println(climbStairs(3));
	}

}
