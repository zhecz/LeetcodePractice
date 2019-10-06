import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Solution {
    public String reverseVowels(String s){
        Set<Character> set = new HashSet<Character>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        char [] word = s.toCharArray();
        int init = 0;
        int last = word.length-1;
        while (init < last){
            while(init<last && !set.contains(word[init])) init++;
            while (init<last && !set.contains(word[last])) last--;
            char temp = word[init];
            word[init] = word[last];
            word[last] = temp;
            init++;
            last--;

        }
        return new String(word);
    }
}
