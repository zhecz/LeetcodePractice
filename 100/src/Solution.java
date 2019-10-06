import java.util.ArrayDeque;
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
    public boolean check(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null|| q==null) return false;
        if(p.val!=q.val) return false;
        return true;
    }
    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p==null && q==null) return true;
        if(!check(p,q)) return false;
        ArrayDeque<TreeNode> pQueue=new ArrayDeque<>();
        ArrayDeque<TreeNode> qQueue=new ArrayDeque<>();
        pQueue.addLast(p);
        qQueue.addLast(q);
        while (!pQueue.isEmpty()){
            TreeNode nodeP=pQueue.removeFirst();
            TreeNode nodeQ=qQueue.removeFirst();
            if(!check(nodeP,nodeQ)) return false;
            if(!check(nodeP.left,nodeQ.left)) return false;
            if(nodeP.left!=null) {
                pQueue.addLast(nodeP.left);
                qQueue.addLast(nodeQ.left);
            }
            if(!check(nodeP.right,nodeQ.right)) return false;
            if(nodeP.right!=null){
                pQueue.addLast(nodeP.right);
                qQueue.addLast(nodeQ.right);
            }

        }
        return true;


        }

}
