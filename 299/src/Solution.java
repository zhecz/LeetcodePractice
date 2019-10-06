public class Solution {
    public String getHint(String secret, String guess){
        int bulls=0;
        int cow=0;
        int [] numbers=new int[10];
        for (int i=0;i<secret.length();i++){
            int s=Character.getNumericValue(secret.charAt(i));
            int g=Character.getNumericValue(guess.charAt(i));
            if(s==g)bulls++;
            else{
                if(numbers[s]<0) cow++;
                if(numbers[g]>0) cow++;
                numbers[s]++;
                numbers[g]--;
            }
        }
        return bulls+"A"+cow+"B";
    }
}
