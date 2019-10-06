public class Solution {
    public int[] searchRange(int[]nums, int target){
        int[] searchRange={-1,-1};
        int leftIndex=findExtremeIndex(nums,target,true);
        if(nums[leftIndex]!=target )


            int leftIndex=findExtremeIndex(nums,target,true);
            int rightIndex=findExtremeIndex(nums,target,false)-1;



        }
    }

    public int findExtremeIndex(int[]nums, int target, boolean left){
        int n=nums.length;
        int low=0;
        int high=n;
        int mid=-1;
        while (low<high){
            mid=low+(high-low)/2;
            if(nums[mid]>target || (left && nums[mid]==target)){
                high=mid;
            }else {
                low=mid+1;
            }
    }
    return low;
}
