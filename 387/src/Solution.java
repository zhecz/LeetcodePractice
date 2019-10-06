import java.util.HashMap;

public class Solution {
    public int firstUniqChar(String s){
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        for (int i =0; i<s.length(); i++){
            char c= s.charAt(i);
            count.put(c,count.getOrDefault(c,0)+1);
        }

        for (int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if (count.get(c)==1) return i;
        }

        return -1;
    }

}
