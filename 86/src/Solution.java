class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
    }
}
public class Solution {
    public ListNode partition(ListNode head, int x){
        if(head==null) return null;
        ListNode dummy1=new ListNode(0);
        ListNode dummy2=new ListNode(0);
        ListNode l1=dummy1;
        ListNode l2=dummy2;
        ListNode p=head;
        while (p!=null){
            if(p.val<x){
                l1.next=p;
                l1=l1.next;
            }else{
                l2.next=p;
                l2=l2.next;
            }
            p=p.next;
        }
        l1.next=dummy2.next;
        l2.next=null;
        return dummy1.next;

    }




}
