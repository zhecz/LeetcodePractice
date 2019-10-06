class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
    }
}

public class Solution {
    public ListNode deleteDuplicates(ListNode head){
        if(head==null) return null;
        ListNode dummy=new ListNode(0==head.val?1:0);
        ListNode first=dummy;
        dummy.next=head;
        ListNode prev=dummy;
        ListNode cur=head;
        while(cur!=null && cur.next!=null){
            if(cur.val!=prev.val && cur.val!=cur.next.val){
                first.next=cur;
                first=first.next;
            }
            prev=cur;
            cur=cur.next;
        }
        if(cur.val!=prev.val){
            first.next=cur;
            first=first.next;
        }
        first.next=null;
        return dummy.next;

    }



}
