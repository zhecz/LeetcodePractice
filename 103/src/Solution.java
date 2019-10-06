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
    public List<List<Integer>> zigzagLevelOrder1(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) return res;
        queue.offer(root);
        boolean order = true;
        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> level = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if (order) {
                    level.add(cur.val);
                } else {
                    level.add(0, cur.val);
                }
                if(cur.left!=null) {
                    queue.offer(cur.left);
                }
                if(cur.right!=null){
                    queue.offer(cur.right);
                }
            }
            res.add(level);
            order=!order;
        }
        return res;
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> res=new LinkedList<>();
        helper(res,root,0);
        return res;

    }

    public void helper(List<List<Integer>>res, TreeNode cur, int level){
        if(cur==null) return;
        if(level>=res.size()){
            res.add(new LinkedList<>());
        }
        List<Integer> colleciton = res.get(level);
        if(level%2>0){
            colleciton.add(0,cur.val);
        }else{
            colleciton.add(cur.val);
        }
        helper(res,cur.left,level+1);
        helper(res, cur.right, level+1);
    }
}
