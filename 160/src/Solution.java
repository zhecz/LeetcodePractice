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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        HashSet<ListNode> setA= new HashSet<>();
        while (headA!=null){
            setA.add(headA);
            headA=headA.next;
        }
        while(headB!=null){
            if(setA.contains(headB)) return headB;
            headB=headB.next;
        }
        return null;
    }
}











