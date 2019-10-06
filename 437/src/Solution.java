import java.util.HashMap;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}
public class Solution {
    public int pathSum(TreeNode root, int sum){
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0,1);
        return helper(root, 0, sum, map);
    }

    public int helper(TreeNode node, int sum, int target, HashMap<Integer, Integer>map){
        if(node==null) return 0;
        sum+=node.val;
        int numPathtoCurr=map.getOrDefault(sum-target,0);
        map.put(sum,map.getOrDefault(sum,0)+1);
        int count=numPathtoCurr+helper(node.left,sum,target,map)+helper(node.right,sum, target,map);
        map.put(sum,map.get(sum)-1);
        return count;

    }
}
