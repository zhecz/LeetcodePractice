import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    private class largerNumberComparator implements Comparator<String> {
        public int compare(String a, String b){
            String order1 = a+b;
            String order2 = b+a;
            return order2.compareTo(order1);
        }

    }

    public String largestNumber(int[] nums){
        String [] words = new String [nums.length];
        for (int i=0; i<nums.length;i++){
            words[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(words,new largerNumberComparator());

        if (words[0].equals("0")) return "0";

        String largestNumberStr = new String();
        for (String word: words){
            largestNumberStr+=word;
        }

        return largestNumberStr;

    }
}
