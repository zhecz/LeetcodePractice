class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}
public class Solution {
    public TreeNode sortedArrayToBST(int[]nums){
        if(nums.length==0) return null;
        TreeNode node=helper(nums,0,nums.length-1);
        return node;
    }
    public TreeNode helper(int[]nums, int left, int right){
        if(left<=right){
            int mid=(left+right)/2;
            TreeNode head=new TreeNode(nums[mid]);
            head.left=helper(nums,left,mid-1);
            head.right=helper(nums,mid+1,right);
            return head;
        }else{
            return null;
        }
    }


}
