class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
    }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode p=l1;
        ListNode q=l2;
        ListNode dummy=new ListNode(0);
        ListNode cur=dummy;
        int carry=0;
        while(p!=null || q!=null){
            int x=(p!=null?p.val:0);
            int y=(q!=null?q.val:0);
            int sum=x+y+carry;
            carry=sum/10;
            cur.next=new ListNode(sum%10);
            cur=cur.next;
            if(p!=null) p=p.next;
            if(q!=null) q=q.next;

        }
        if(carry>0){
            cur.next=new ListNode(carry);
        }
        return dummy.next;

    }


}
