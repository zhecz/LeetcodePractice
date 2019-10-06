import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> letterCombinations1(String digits){
        List<String> res=new LinkedList<>();
        if(digits==null || digits.isEmpty()) return res;
        String[] mapping={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        res.add("");
        for(int i=0;i<digits.length();i++){
            List<String> combinations=res;
            res=new LinkedList<>();
            for(String combination: combinations){
                for(int j=0;j<mapping[digits.charAt(i)-'0'].length();j++){
                    res.add(combination+mapping[digits.charAt(i)-'0'].charAt(j));
                }
            }
        }
        return res;
    }

    public List<String> letterCombinations2(String digits){
        List<String> res=new LinkedList<>();
        if(digits==null || digits.isEmpty()) return res;
        String[] mapping={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        res.add("");
        for(int i=0; i<digits.length();i++){
            int s=Character.getNumericValue(digits.charAt(i));
            while (((LinkedList<String>) res).peek().length()==i){
                String item=((LinkedList<String>) res).remove();
                for(char c:mapping[s].toCharArray()){
                    res.add(item+c);
                }
            }

        }
        return res;
    }

    List<String> res=new LinkedList<>();
    Map<String, String> table=new HashMap(){{
        put("2","abc");
        put("3","def");
        put("4","ghi");
        put("5","jkl");
        put("6","mno");
        put("7","pqrs");
        put("8","tuv");
        put("9","wxyz");
    }};


    public List<String> letterCombinations(String digits){
        if(digits.length()!=0){
            backtrack("",digits);
        }
        return res;

    }

    public void backtrack(String combination, String next_digits){
        if(next_digits.length()==0) res.add(combination);
        else{
            String digit=next_digits.substring(0,1);
            String letters=table.get(digit);
            for(int i=0;i<letters.length();i++){
                String letter=letters.substring(i,i+1);
                backtrack(combination+letter,next_digits.substring(1));
            }

        }
    }
}
