public class Solution {
    public int strStr(String haystack, String needle){
        if (needle.length()==0) return 0;
        if (haystack.length()==0) return -1;
        for (int j=0; j<haystack.length()-needle.length()+1; j++){
            for (int i=0; i<needle.length();i++){
                if (needle.charAt(i) != haystack.charAt((i+j))) break;
                if (i==needle.length()-1) return j;

            }

        }
        return -1;
    }

}
