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
    public int sumNumbers1(TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        int sum=0;
        if(root==null) return sum;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode cur=stack.pop();
            if(cur.left!=null){
                cur.left.val+=cur.val*10;
                stack.push(cur.left);
            }
            if(cur.right!=null){
                cur.right.val+=cur.val*10;
                stack.push(cur.right);
            }
            if(cur.left==null && cur.right==null){
                sum+=cur.val;
            }
        }
        return sum;
    }
    int sum=0;
    public int sumNumbers(TreeNode root){

        int pathSum=0;
        helper(root,pathSum);
        return sum;

    }

    public void helper(TreeNode node,int pathSum){
        if(node==null) return;
        pathSum=pathSum*10+node.val;
        if(node.left==null && node.right==null){
            sum+=pathSum;
            return;
        }
        helper(node.left,pathSum);
        helper(node.right,pathSum);
    }
}
