class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
    }
}

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n){
        int length=0;
        ListNode first=head;
        while(first!=null){
            length++;
            first=first.next;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        int size=length-n+1;
        first=dummy;
        while (size>1){
            first=first.next;
            size--;
        }
        first.next=first.next.next;
        return dummy.next;
    }


}
