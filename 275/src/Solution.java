public class Solution {
    public int hIndex(int[] citations){
        int len=citations.length;
        int left=0;
        int right=len-1;
        int mid;
        while(left<right){
            mid=(left+right)/2;
            if(citations[mid]<len-mid){
                left=mid+1;
                }else{
                right=mid;
            }

        }
        if(left<len && citations[left]>=len-left)
            return len-left;
        else {
            return 0;
        }
    }
}
