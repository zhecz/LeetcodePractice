class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}
public class Solution {
    public TreeNode buildTree(int[]preorder, int[]inorder){
        if(preorder.length!=inorder.length) return null;
        return helper(preorder,0,preorder.length-1,
                inorder,0,inorder.length-1);

    }

    public TreeNode helper(int[]preorder, int prelow, int prehigh,
                           int[]inorder, int inlow, int inhight){
        if(prelow>prehigh || inlow>inhight) return null;
        TreeNode node=new TreeNode(preorder[prelow]);
        int index=0;
        for (int i=0;i<inorder.length;i++){
            if(inorder[i]==preorder[prelow]){
                index=i;
                break;
            }
        }
        int length=index-inlow;
       node.left= helper(preorder,prelow+1,prelow+length,inorder,inlow,index-1);
       node.right=helper(preorder,prelow+length+1,prehigh,inorder,index+1,inhight);
       return node;

    }
}
