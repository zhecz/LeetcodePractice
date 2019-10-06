public class Solution {
    public void reverseString(char[] s){
        int j=s.length-1;
        int i=0;
        while (i<j){
            char temp=s[j];
            s[j]=s[i];
            s[i]=temp;
            j--;
            i++;
        }

    }
}
