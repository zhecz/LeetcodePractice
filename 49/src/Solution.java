import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs){
        if (strs.length==0) return new ArrayList();
        Map<String, List> dict = new HashMap<String, List>();
        for (int i=0; i<strs.length;i++){
            char [] word= strs[i].toCharArray();
            Arrays.sort(word);
            String newWord = String.valueOf(word);
            if (!dict.containsKey(newWord))dict.put(newWord,new ArrayList());
            dict.get(newWord).add(strs[i]);

        }
        return new ArrayList(dict.values());
    }
}
