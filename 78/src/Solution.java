import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>tempList=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list,tempList,nums,0);
        return list;

    }

    public void backtrack(List<List<Integer>> list, List<Integer>tempList,
                          int[]nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i=start;i<nums.length;i++){
            tempList.add(nums[i]);
            backtrack(list,tempList,nums,i+1);
            tempList.remove(tempList.size()-1);
        }
    }
}
