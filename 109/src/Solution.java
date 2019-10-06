import org.omg.CORBA.TRANSACTION_MODE;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
    }
}
public class Solution {
    private ListNode head;

    int findSize(ListNode head){
        int i=0;
        ListNode ptr=head;
        while(ptr!=null){
            i++;
            ptr=ptr.next;
        }
        return i;
    }

    public TreeNode helper(int left, int right){
        if(left>right) return null;
        int mid=(left+right)/2;
        TreeNode leftNode= helper(left,mid-1);
        TreeNode node=new TreeNode(this.head.val);
        node.left=leftNode;
        head=head.next;
        node.right=helper(mid+1,right);
        return node;
    }

    public TreeNode sortedListToBST (ListNode head){
        if(head==null) return null;
        int size=findSize(head);
        this.head=head;
        TreeNode node=helper(0,size-1);
        return node;
    }
}
