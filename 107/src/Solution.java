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
    public List<List<Integer>> levelOrderBottom1(TreeNode root){
        List<List<Integer>> res=new LinkedList<>();
        if(root==null) return res;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size=queue.size();
            List<Integer> level=new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode cur=queue.poll();
                level.add(cur.val);
                if(cur.left!=null){
                    queue.offer(cur.left);
                }
                if(cur.right!=null){
                    queue.offer(cur.right);
                }
            }
            res.add(0,level);
        }
        return res;
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root){
        int level=0;
        List<List<Integer>> res=new LinkedList<>();
        helper(res,root,0);
        return res;
    }

    public void helper(List<List<Integer>> res, TreeNode cur, int level){
        if(cur==null) return;
        if(level>=res.size()){
            res.add(0,new LinkedList<>());
        }
        helper(res,cur.left,level+1);
        helper(res, cur.right, level+1);
        res.get(res.size()-level-1).add(cur.val);
    }



}
