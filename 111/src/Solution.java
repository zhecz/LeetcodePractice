class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}
public class Solution {
    public int minDepth(TreeNode root){
        if(root==null) return 0;
        if(root.left==null) return minDepth(root.right)+1;
        if(root.right==null) return minDepth(root.left)+1;
        return 1+Math.min(minDepth(root.left),minDepth(root.right));
    }

}
