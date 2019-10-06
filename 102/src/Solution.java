import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result= new LinkedList<>();
        if(root==null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int cnt=queue.size();
            List level=new LinkedList();
            for(int i=0;i<cnt;i++){
                TreeNode node=queue.poll();
                level.add(node.val);
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);

            }
            result.add(level);
        }
        return result;
    }




}
