import java.util.List;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){val=x;}
}
public class Solution {
    public ListNode deleteDuplicates(ListNode head){
        ListNode cur=head;
        while(cur!=null && cur.next!=null){
            if(cur.val == cur.next.val){
                cur.next=cur.next.next;
            }
            else{
                cur=cur.next;
            }
        }
        return head;
    }
}
