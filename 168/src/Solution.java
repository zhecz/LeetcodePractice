public class Solution {
    public String convertToTitle(int n){
        StringBuilder str = new StringBuilder();
        while (n>0){
            n--;
            str.insert(0,(char)('A'+n%26));
            n/=26;
        }
        return str.toString();
    }
}
