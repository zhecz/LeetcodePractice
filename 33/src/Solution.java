public class Solution {
    public int search(int[]nums,int target){
        int n=nums.length;
        int left=0;
        int right=n-1;
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]>nums[right]){
                left=mid+1;

            }else{
                right=mid;
            }
        }
        int small=left;
        left=0;
        right=n-1;
        while(left<=right){
            int mid=(left+right)/2;
            int realMid=(mid+small)%n;
            if(nums[realMid]==target)return realMid;
            else if(nums[realMid]>target)right=mid-1;
            else{
                left=mid+1;
            }
        }
        return -1;
    }

}
