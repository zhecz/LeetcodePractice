public class Solution {
    public boolean canConstruct(String ransomNote, String magazine){
        int[] arr = new int[26];
        for(int i=0; i<magazine.length();i++){
            char c = magazine.charAt(i);
            arr[c-'a']++;
        }
        for (int j=0; j<ransomNote.length(); j++){
            if (--arr[ransomNote.charAt(j)-'a']<0) return false;

        }

        return true;

    }
}
