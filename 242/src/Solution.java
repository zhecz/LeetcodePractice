import java.util.Arrays;

public class Solution {
    public boolean isAnagram(String s, String t){
        if (s.length() != t.length()) return false;
        char [] str1 = s.toCharArray();
        char [] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1,str2);
    }

    public boolean isAnagramHashmap(String s, String t){
        if (s.length()!=t.length()) return false;

        int [] map = new int[26];
        for (int i=0; i<s.length();i++){
            map[s.charAt(i)-'a']++;
            map[t.charAt(i)-'a']--;
        }

        for (int count: map){
            if(count!=0) return false;
        }

        return true;


    }

}
