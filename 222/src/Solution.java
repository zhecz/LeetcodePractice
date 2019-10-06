class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}
public class Solution {
    public int height(TreeNode node){
        if(node==null) return -1;
        else{
        return 1+height(node.left);
    }

    }
    public int countNodes(TreeNode root){
        int height=height(root);
        int nodes=0;
        while(root!=null){
            if(height(root.right)==height-1){
                nodes+=1<<height;
                root=root.right;
            }else{
                nodes+=1<<height-1;
                root=root.left;
            }
            height--;
        }
        return nodes;

    }
}
