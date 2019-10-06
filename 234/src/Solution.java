class ListNode{
    int val;
    ListNode next;
    ListNode(int x) {val=x;}
}
public class Solution {
    public boolean isPalindrome(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        ListNode cur = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast!=null) slow=slow.next;
        slow=reverse(slow);
        while(slow!=null){
            if(cur.val!=slow.val) return false;
            cur=cur.next;
            slow=slow.next;
        }
        return true;

    }

    public ListNode reverse(ListNode head){

        ListNode pre=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;
    }
}
