class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}

public class Solution {
    public TreeNode buildTree(int[]inorder, int[]postorder){

        if(inorder.length!=postorder.length) return null;
        return helper(inorder,0,inorder.length-1,
                postorder,0,postorder.length-1);
    }

    public TreeNode helper(int[]inorder, int inlow, int inhigh,
                           int[]postorder, int postlow, int posthigh){
        if(inlow>inhigh || postlow>posthigh) return null;

        TreeNode root=new TreeNode(postorder[posthigh]);
        int rootIndex=0;
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==root.val){
                rootIndex=i;
                break;
            }
        }
        int rightLength=inhigh-rootIndex;
        root.right=helper(inorder,rootIndex+1,inhigh,
                postorder,posthigh-rightLength,posthigh-1);
        root.left=helper(inorder,inlow,rootIndex-1,
                postorder,postlow,posthigh-rightLength-1);
        return root;

    }
}
