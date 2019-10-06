import java.util.HashMap;
import java.util.HashSet;
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
    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q){
        Stack<TreeNode> stack=new Stack<>();
        HashMap<TreeNode,TreeNode> map= new HashMap<>();
        stack.push(root);
        map.put(root,null);
        while(!map.containsKey(p) || !map.containsKey(q)) {
            TreeNode cur = stack.pop();
            if (cur.left != null) {
                stack.push(cur.left);
                map.put(cur.left, cur);
            }
            if (cur.right != null) {
                stack.push(cur.right);
                map.put(cur.right, cur);
            }
        }
        HashSet<TreeNode> set=new HashSet<>();
        while(p!=null){
            set.add(p);
            p=map.get(p);
        }
        while(!set.contains(q)){
            q=map.get(q);
        }
        return q;
    }

    TreeNode res=null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        traverseTree(root,p,q);
        return res;
    }

    public boolean traverseTree(TreeNode cur, TreeNode p, TreeNode q){
        if(cur==null) return false;
        int left=traverseTree(cur.left,p,q)?1:0;
        int right=traverseTree(cur.right,p, q)? 1:0;
        int mid=(cur.val==p.val || cur.val==q.val)?1:0;
        if(left+right+mid>=2) res=cur;
        return (left+right+mid>0);
    }





}
