class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}
public class Solution {
    public boolean isBalanced(TreeNode root){

        return helper(root)!=-1;
    }

    public int helper(TreeNode node){
        if(node==null) return 0;
        int left=helper(node.left);
        int right=helper(node.right);
        if(left==-1 || right==-1 ||Math.abs(helper(node.left)-helper(node.right))>1) return -1;
        return Math.max(left,right)+1;
    }


}
