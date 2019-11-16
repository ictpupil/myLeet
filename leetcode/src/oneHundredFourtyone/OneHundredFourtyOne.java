package oneHundredFourtyone;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}
public class OneHundredFourtyOne {
	
	public boolean hasCycle(ListNode head) {
        if(head==null)return false;
        ListNode fastt = head;
        ListNode sloww = head;
        while(true){
            if(fastt.next==null)return false;
            fastt = fastt.next;
            if(fastt.next==null)return false;
            fastt = fastt.next;
            if(sloww.next==null)return false;
            sloww = sloww.next;
            if(fastt==sloww)return true;
        }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
