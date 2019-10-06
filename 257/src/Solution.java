import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}
public class Solution {
    public List<String> binaryTreePaths(TreeNode root){
        List<String> res=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        helper(res,root,sb);
        return res;
    }
    public void helper(List<String> res,TreeNode node,StringBuilder sb ){
        if(node==null) {
            return;
        }
        int len=sb.length();
        sb.append(node.val);
        if(node.left==null && node.right==null){
            res.add(sb.toString());
        }
        else{
            sb.append("->");
            helper(res,node.left,sb);
            helper(res,node.right,sb);
        }
        sb.setLength(len);




    }
}
