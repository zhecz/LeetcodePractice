import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combine(int n, int k){
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> tempList=new ArrayList<>();
        backtrack(list,tempList,n,k,1);
        return list;

    }

    public void backtrack(List<List<Integer>>list, List<Integer>tempList, int n,
                          int k, int start){
        if(k==0){
            list.add(new ArrayList<>(tempList));
            return;
        }

        for(int i=start;i<=n;i++){
            tempList.add(i);
            backtrack(list,tempList,n,k-1,i+1);
            tempList.remove(tempList.size()-1);
        }
    }
}
