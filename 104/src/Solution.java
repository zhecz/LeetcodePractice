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
    public int masDepth(TreeNode root){
        if(root==null) return 0;
        Stack<TreeNode> stack=new Stack<TreeNode>();
        Stack<Integer>  value= new Stack<Integer>();
        stack.push(root);
        value.push(1);
        int max=0;
        while(!stack.isEmpty()){
            TreeNode node= stack.pop();
            int temp=value.pop();
            max=Math.max(max,temp);
            if(node.left!=null){
                stack.push(node.left);
                value.push(temp+1);
            }
            if(node.right!=null){
                stack.push(node.right);
                value.push(temp+1);
            }
        }
        return max;
    }

}






