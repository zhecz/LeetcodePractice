public class Solution {
    public int removeDuplicates(int[]nums){
        int n=nums.length;
        int k=2;
        return removeDuplicates(nums,n,k);
    }

    public int removeDuplicates(int[]nums, int n, int k){
        int j=0;
        int count=1;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[j]){
                count=1;
                j++;
                nums[j]=nums[i];
            }
            else{
                if(count<k){
                    j++;
                    nums[j]=nums[i];
                    count++;
                }
            }
        }
        return j+1;
    }
}
