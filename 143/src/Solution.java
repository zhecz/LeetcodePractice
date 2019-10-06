class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
    }
}

public class Solution {
    public void reorderList(ListNode head){
        if(head==null) return;
        ListNode slow=head;
        ListNode fast=head;
        while (fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode head2=reverse(slow.next);
        slow.next=null;
        ListNode head1=head;
        while(head2!=null){
            ListNode temp1=head1.next;
            ListNode temp2=head2.next;
            head1.next=head2;
            head2.next=temp1;
            head1=temp1;
            head2=temp2;
        }
    }

    public ListNode reverse(ListNode head){
        if(head==null) return null;
        ListNode prev=null;
        ListNode cur=head;
        while (cur!=null){
            ListNode tmp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=tmp;
        }
        return prev;
    }


}
