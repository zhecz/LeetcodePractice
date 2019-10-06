import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public List<List<Integer>> combinationSum(int[] candidates,int target){
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer>tempList=new ArrayList<>();
        backtrack(res,tempList,candidates,target,0);
        return res;

    }

    public void backtrack(List<List<Integer>>res, List<Integer>tempList,
                          int[]nums, int remain, int start){
        if(remain==0) res.add(new ArrayList<>(tempList));
        if(remain<0) return;
        for(int i=start;i<nums.length;i++){
            tempList.add(nums[i]);
            backtrack(res,tempList,nums,remain-nums[i],i);
            tempList.remove(tempList.size()-1);
        }
    }
}
