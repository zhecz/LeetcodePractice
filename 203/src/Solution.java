class ListNode{
    int val;
    ListNode next;
    ListNode(int x) {
        val=x;
    }
}
public class Solution {
    public ListNode removeElements(ListNode head, int val){
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode current=head;
        while (current!=null){
            if(current.val==val){
                prev.next=current.next;
                current=current.next;

            }else{
                prev=current;
                current=current.next;
            }

        }
        return dummy.next;
    }
}
