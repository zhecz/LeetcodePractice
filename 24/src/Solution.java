class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
    }
}
public class Solution {
    public ListNode swapPairs(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode point=dummy;
        while(point.next!= null && point.next.next!=null){
            ListNode first=point.next;
            ListNode second= point.next.next;
            first.next=second.next;
            point.next=second;
            second.next=first;
            point=first;
        }
        return dummy.next;

    }
}
