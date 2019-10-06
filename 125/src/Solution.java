public class Solution {
    public boolean isPalindrome(String s){
        if (s==null) return false;
        if(s.isEmpty()) return true;
        int left=0;
        int right=s.length()-1;
        String lowercase =s.toLowerCase();
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(lowercase.charAt(left))) left++;
            if(left>=right) break;
            while(left<right && !Character.isLetterOrDigit(lowercase.charAt(right))) right--;
            if(left>=right) break;
            if(lowercase.charAt(left)!=lowercase.charAt(right)) return false;
            left++;
            right--;

        }
        return true;

    }



}
