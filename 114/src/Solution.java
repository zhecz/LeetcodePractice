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
    public void flatten1(TreeNode root){
        if(root==null) return;
        Stack<TreeNode> stack=new Stack<>();
        TreeNode prev=null;
        stack.push(root);
        TreeNode cur=null;
        while(!stack.isEmpty()){
            cur=stack.pop();
            if(prev!=null) {
                prev.right=cur;
                prev.left=null;
            }
            if(cur.right!=null) stack.push(cur.right);
            if(cur.left!=null) stack.push(cur.left);
            prev=cur;
        }
        cur.right=null;
    }
    TreeNode prev=null;

    public void flatten(TreeNode root){

        if(root==null) return;
        flatten(root.right);
        flatten(root.left);
        root.left=null;
        root.right=prev;
        prev=root;

    }



}
