import java.util.Arrays;

public class Solution {
    public boolean isIsomorphic(String s, String t){
        int m = s.length();
        int n = t.length();
        if (m!=n) return false;
        int size = 256;
        int [] map = new int[size];
        Arrays.fill(map,-1);
        Boolean []visited = new Boolean[size];
        Arrays.fill(visited, Boolean.FALSE);

        for (int i=0; i<m; i++){
            if(map[s.charAt(i)]==-1){
                if (visited[t.charAt(i)]!=false) return false;
                visited[t.charAt(i)]=true;
                map[s.charAt(i)]=t.charAt(i);
            }else if (map[s.charAt(i)]!=t.charAt(i)) return false;

        }
        return true;

    }
}
