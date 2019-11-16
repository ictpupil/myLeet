package twentyone;
class ListNode {
		  int val;
		  ListNode next;
		  ListNode(int x) { val = x; }
	}
public class twentyone {

	
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        //ans = ans.next;
        ListNode temp = ans;
		while(l1!=null&&l2!=null) {
			if(l1.val<=l2.val) {
				temp.next = l1;l1 = l1.next;temp = temp.next;
			}
			else {
				temp.next = l2;l2 = l2.next;temp = temp.next;
			}
			
        }
		if(l1!=null) {
			temp.next = l1;
		}
		if(l2!=null) {
			temp.next = l2;
		}
		return ans.next;
    }
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		//l2 = l2.next;
		ListNode  ans = mergeTwoLists(l1,l2);
		while(ans!=null){
			System.out.println(ans.val);
			ans = ans.next;
		}
	}

}
