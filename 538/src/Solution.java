import java.util.Stack;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}
public class Solution {
    public TreeNode convertBST(TreeNode root){
        int sum=0;
        Stack<TreeNode>stack=new Stack<TreeNode>();
        if(root==null) return null;
        TreeNode node=root;
        while(!stack.isEmpty() || node!=null){
            while(node!=null){
                stack.add(node);
                node=node.right;
            }
            node=stack.pop();
            sum+=node.val;
            node.val=sum;
            node=node.left;
        }
        return root;
    }





}
