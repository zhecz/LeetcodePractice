import java.util.Stack;

class TreeNode{
    double val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}

public class Solution {
    public boolean isValidBST(TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        TreeNode cur=root;
        Double prev=-Double.MAX_VALUE;
        while(cur!=null || !stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            cur=stack.pop();
            if(cur.val<=prev) return false;
            prev=cur.val;
            cur=cur.right;
        }
        return true;
    }
}
