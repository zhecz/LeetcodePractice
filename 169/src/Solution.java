import java.util.HashMap;
import java.util.Map;

public class Solution {

    public Map<Integer,Integer> countNums(int[]nums){
        Map<Integer,Integer> map=new HashMap<>();

        for(int num:nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }else {
                map.put(num,map.get(num)+1);
            }
        }
        return map;
    }
    public int majorityElement(int[]nums){
        Map<Integer,Integer> counts=this.countNums(nums);
        Map.Entry<Integer,Integer> majorityEle=null;
        for(Map.Entry<Integer,Integer> count: counts.entrySet()){
            if(majorityEle==null || count.getValue()>majorityEle.getValue()){
                majorityEle=count;
            }
        }
        return majorityEle.getKey();

    }
}
