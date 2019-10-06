import java.util.HashSet;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
        next=null;
    }
}

public class Solution {
    public boolean hasCycle(ListNode head){
        HashSet<ListNode> set = new HashSet<>();
        while(head!=null){
            if(set.contains(head)) return true;
            set.add(head);
            head=head.next;

        }
        return false;
    }

    public boolean hasCycle2(ListNode head){
        if(head==null || head.next==null) return false;
        ListNode fast=head.next;
        ListNode slow=head;
        while(slow!=fast){
            if (fast==null || fast.next==null) return false;
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;
    }
}
