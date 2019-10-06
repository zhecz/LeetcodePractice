import java.util.HashMap;
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
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> res=new LinkedList<>();
        helper(res, root, 0);
        return res;
    }

    public void helper(List<Integer>res, TreeNode cur, int level){
        if(cur==null) return;
        if(level==res.size()){
            res.add(cur.val);
        }
        helper(res,cur.right,level+1);
        helper(res, cur.left, level+1);
    }

    public List<Integer> rightSideView1(TreeNode root){
        Stack<TreeNode> nodeStack=new Stack<>();
        Stack<Integer> depthStack=new Stack<>();
        List<Integer> res=new LinkedList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        if(root==null) return res;
        nodeStack.push(root);
        depthStack.push(0);
        int maxDepth=-1;
        while (!nodeStack.isEmpty()){
            TreeNode cur=nodeStack.pop();
            int depth=depthStack.pop();
            maxDepth=Math.max(maxDepth,depth);
            if(!map.containsKey(depth)) map.put(depth,cur.val);
            if(cur.left!=null) {
                nodeStack.push(cur.left);
                depthStack.push(depth+1);
            }
            if(cur.right!=null){
                nodeStack.push(cur.right);
                depthStack.push(depth+1);
            }
        }
        for(int i=0;i<=maxDepth;i++){
            res.add(map.get(i));
        }
        return res;
    }



}
