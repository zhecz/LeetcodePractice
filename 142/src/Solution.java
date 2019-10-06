class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
        next=null;
    }
}

public class Solution {
    public ListNode detectCycle(ListNode head){
        if(head==null ||head.next==null) return null;
        ListNode fast=head;
        ListNode slow=head;
        ListNode start=head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                while (slow!=start){
                    start=start.next;
                    slow=slow.next;
                }
                return start;
            }
        }
        return null;
    }





}
