import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public boolean wordPattern(String pattern, String str){
        String[] words = str.split(" ");
        HashMap<Character, String> map = new HashMap();
        HashSet<String> set = new HashSet();
        if (pattern.length()!=words.length) return false;

        for (int i=0; i<pattern.length();i++){
            char c=pattern.charAt(i);
            if(!map.containsKey(c)){
                if(!set.add(words[i])){
                    return false;
                }
                map.put(c,words[i]);
            }else if (!map.get(c).equals(words[i])) return false;
        }
        return true;
    }
}
