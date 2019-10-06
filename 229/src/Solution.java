import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> majorityElement(int[] nums){
        Integer major1=null, major2=null,count1=0, count2=0;
        for(Integer num:nums){
            if(num.equals(major1)){
                count1++;
            }else if(num.equals(major2)){
                count2++;
            }else if(count1==0){
                major1=num;
                count1=1;
            }else if(count2==0){
                major2=num;
                count2=1;
            }else {
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(Integer val:nums){
            if(val.equals(major1)) count1++;
            else if(val.equals(major2)){
                count2++;
            }

        }
        List<Integer> res=new ArrayList<>();
        if(count1>nums.length/3) res.add(major1);
        if(count2>nums.length/3) res.add(major2);
        return res;
    }
}
