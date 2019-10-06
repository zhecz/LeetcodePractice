public class Solution {
    public int hIndex(int[] citations){
        int len=citations.length;
        int[] buckets=new int[len+1];
        int cnt=0;
        for(int citation:citations){
            if(citation>len) buckets[len]++;
            else {
                buckets[citation]++;
            }
        }
        for(int i=len;i>=0;i--){
            cnt+=buckets[i];
            if(cnt>=i) return i;
        }
        return 0;
    }
}
