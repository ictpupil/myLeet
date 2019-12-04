package oneToTen;

public class Eight {

    public int myAtoi(String str) {
        int ans = 0;
        int indexx = 0;
        int flag=1;
        while(indexx<str.length()&&str.charAt(indexx)==' ')indexx++;
        if(indexx<str.length()-1&&str.charAt(indexx)=='-') {
        	flag = -1;
        	indexx++;
        }else if(indexx<str.length()-1&&str.charAt(indexx)=='+') {
        	indexx++;
        }
        for(int i = indexx;i<str.length();i++) {
        	//System.out.println(str.charAt(i));
        	if(str.charAt(i)<'0'||str.charAt(i)>'9')
        		break;
        	int cur = (str.charAt(i)-'0');
        	
        	if(flag*ans==Integer.MIN_VALUE/10&&cur>8||flag*ans<Integer.MIN_VALUE/10)
        		return Integer.MIN_VALUE;
        	else if(flag*ans==Integer.MAX_VALUE/10&&cur>7||flag*ans>Integer.MAX_VALUE/10)
        		return Integer.MAX_VALUE;
        	ans = ans*10+cur;
        }
        return ans*flag;
    }
	
	public static void main(String[] args) {
		Eight e = new Eight();
		System.out.println(e.myAtoi(" 2147483649"));
		System.out.println(e.myAtoi(" -9ddg"));
		System.out.println(e.myAtoi(" - t9"));
		System.out.println(e.myAtoi(" -2147483650"));
		System.out.println(Integer.MIN_VALUE);
	}
}
