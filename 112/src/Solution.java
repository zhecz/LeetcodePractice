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
    public boolean hasPathSum1(TreeNode root, int sum){
        Stack<TreeNode> stack=new Stack<TreeNode>();
        if(root==null) return false;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode curr=stack.pop();
            if(curr.left==null && curr.right==null && curr.val==sum) return true;
            if(curr.left!=null){
                curr.left.val+=curr.val;
                stack.push(curr.left);
            }
            if(curr.right!=null){
                curr.right.val+=curr.val;
                stack.push(curr.right);
            }

        }
        return false;

    }

    public boolean hasPathSum(TreeNode root, int sum){
        if(root==null) return false;
        if(root.left==null && root.right==null && root.val==sum) return true;

        return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right, sum-root.val);
    }


}
