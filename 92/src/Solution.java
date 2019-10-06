class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
    }
}

public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n){
        if(head==null) return null;
        ListNode prev=null;
        ListNode cur=head;
        while(m>1){
            prev=cur;
            cur=cur.next;
            m--;
            n--;
        }
        ListNode third=null;
        ListNode con=prev;
        ListNode tail=cur;
        while(n>0){
            third=cur.next;
            cur.next=prev;
            prev=cur;
            cur=third;
            n--;
        }
        if(con!=null){
            con.next=prev;
        }else{
            head=prev;
        }
        tail.next=cur;
        return head;
    }


}
