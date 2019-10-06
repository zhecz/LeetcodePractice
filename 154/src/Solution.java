public class Solution {
    public int findMin(int[] nums){
        int n=nums.length;
        int left=0;
        int right=n-1;
        int mid=-1;

        int res=-1;
        while(left<right){
            mid=left+(right-left)/2;
            if(nums[mid]<nums[right]) right=mid;
            else if(nums[mid]>nums[right]) left=mid+1;
            else{
                if(nums[right]<nums[right-1]){
                    res=nums[right];
                    break;
                }
                right--;
            }
        }
        res=nums[left];
        return res;
    }
}
