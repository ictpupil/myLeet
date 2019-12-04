package oneToTen;
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Two {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode ans = new ListNode(0);
    	ListNode curNode = ans;
    	//curNode = curNode.next;
        int flag = 0;
    	while(l1!=null&&l2!=null) {
    		
    		System.out.println("jin");
        	int cur = l1.val+l2.val+flag;
        	ListNode tt = new ListNode(cur%10);
    		curNode.next = tt;
        	if(cur>=10)
        	{
        		
        		flag = 1;
        	}else {
        		flag = 0;
        	}
        	l1 = l1.next;
        	l2 = l2.next;
        	curNode = curNode.next;
        }
    	ListNode tmp = ans.next;
    	System.out.println("ans:");
    	while(tmp!=null) {
			System.out.println(tmp.val);
			tmp = tmp.next;
		}
    	System.out.println("end");
    	if(l1==null&&l2==null) {
    		if(flag==1) {
    			curNode.next = new ListNode(1);
    		}
    		return ans.next;
    	}
    	else {
    		while(l1!=null||l2!=null||flag==1) {
    			System.out.println("1ci");
    			int cur1 = l1!=null?l1.val:0;
    			int cur2 = l2!=null?l2.val:0;
    			int cur = cur1+cur2+flag;
    			ListNode tt = new ListNode(cur%10);
        		curNode.next = tt;
        		curNode=curNode.next;
        		System.out.println("tt:"+tt.val);
    			if(cur>9) flag = 1;
    			else flag = 0;
    			if(l1!=null) l1 = l1.next;
    			if(l2!=null) l2 = l2.next;
    			
    			ListNode tmp2 = ans.next;
    			System.out.println("ans:");
    			while(tmp2!=null) {
    				System.out.println(tmp2.val);
    				tmp2 = tmp2.next;
    			}
    			System.out.println("end");
    		}
    		
    	}
    	
    	System.out.println("end");
        return ans.next;
    }
	public static ListNode test() {
		ListNode list = new ListNode(0);
		ListNode cur = list;
		list = list.next;
		return cur;
	}
	public static void main(String[] args) {
		ListNode list1 = new ListNode(9);
		list1.next = new ListNode(9);
		ListNode list2 = new ListNode(1);
		ListNode anslist = new Two().addTwoNumbers(list2,list1);
		while(anslist!=null) {
			System.out.println(anslist.val);
			anslist = anslist.next;
		}
	}
	

}
