import java.util.LinkedList;
import java.util.List;
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
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> result=new LinkedList<>();
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            if(node!=null){
                result.add(node.val);
                stack.push(node.right);
                stack.push(node.left);
            }

        }
        return result;
    }





}
