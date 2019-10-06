import java.util.TreeSet;

public class Solution {
    public boolean containsNearbyAlomostDuplicate(int[]nums, int k, int t){
        TreeSet<Long> set=new TreeSet<Long>();
        for (int i=0;i<nums.length;i++){
            long num=nums[i];
            Long floor = set.floor((long)(num+t));
            Long ceil=set.ceiling((long)(num-t));
            if ((floor !=null && floor>=num ) || (ceil!=null && ceil<=num)) {
                return true;
            }
            if(i>k) set.remove(nums[i-k-1]);
            set.add(num);
        }
        return false;
    }
}
