import java.util.LinkedList;
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
    public boolean isSymmetric(TreeNode root){
        Queue<TreeNode>queue=new LinkedList<>();
        ((LinkedList<TreeNode>) queue).add(root);
        ((LinkedList<TreeNode>) queue).add(root);
        while(!queue.isEmpty()){
            TreeNode t1=queue.poll();
            TreeNode t2=queue.poll();
            if(t1==null && t2==null) continue;
            if(t1==null || t2==null) return false;
            if(t1.val!=t2.val) return false;
            ((LinkedList<TreeNode>) queue).add(t1.left);
            ((LinkedList<TreeNode>) queue).add(t2.right);
            ((LinkedList<TreeNode>) queue).add(t1.right);
            ((LinkedList<TreeNode>) queue).add(t2.left);
        }
        return true;
    }
}
