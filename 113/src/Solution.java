import java.util.ArrayList;
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
    public List<List<Integer>> pathSum1(TreeNode root, int sum){
        Stack<TreeNode> stack=new Stack<>();
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        if(root==null) return res;
        TreeNode curr=root;
        TreeNode prev=null;
        int pathSum=0;
        while (curr!=null || !stack.isEmpty()){
            while(curr!=null){
                stack.push(curr);
                path.add(curr.val);
                pathSum+=curr.val;
                curr=curr.left;
            }
            curr=stack.peek();
            if(curr.right!=null && curr.right!=prev){
                curr=curr.right;
                continue;
            }
            if(curr.left==null && curr.right==null && pathSum==sum){
                res.add(new ArrayList<>(path));
            }
            stack.pop();
            prev=curr;
            pathSum-=curr.val;
            path.remove(path.size()-1);
            curr=null;
        }
        return res;
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum){
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int sumPath=0;
        helper(root,sumPath,sum,path,res);
        return res;
    }

    public void helper(TreeNode node, int sumPath, int sum, List<Integer>path,
                       List<List<Integer>>res){
        if(node==null) return;
        sumPath+=node.val;
        path.add(node.val);
        if(node.left==null && node.right==null && sumPath==sum){
            res.add(new ArrayList<>(path));
            path.remove(path.size()-1);
            return;
        }
        helper(node.left,sumPath,sum,path,res);
        helper(node.right,sumPath,sum,path,res);
        path.remove(path.size()-1);
    }
}
