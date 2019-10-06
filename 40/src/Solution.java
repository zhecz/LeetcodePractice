import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum2(int[]candidates, int target){
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> tempList=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(list,tempList,candidates,target,0);
        return list;
    }

    public void backtrack(List<List<Integer>>list, List<Integer>tempList, int[] nums,
                          int remain, int start){
        if(remain<0)return;
        if(remain==0) list.add(new ArrayList<>(tempList));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1])continue;
            tempList.add(nums[i]);
            backtrack(list,tempList,nums,remain-nums[i],start+1);
            tempList.remove(tempList.size()-1);

        }
    }
}
