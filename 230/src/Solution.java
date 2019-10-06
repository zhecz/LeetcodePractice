import java.util.ArrayList;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}
public class Solution {
    ArrayList<Integer> sortedNodes;
    public int kthSmallest(TreeNode root, int k){
        sortedNodes=new ArrayList<Integer>();
        inorder(root);
        return sortedNodes.get(k-1);
    }

    public void inorder(TreeNode node){
        if(node==null) return;
        inorder(node.left);
        sortedNodes.add(node.val);
        inorder(node.right);
    }


}
