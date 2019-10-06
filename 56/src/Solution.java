import java.util.*;

class Interval{
    int start;
    int end;
    Interval(int[] interval){
        start=interval[0];
        end=interval[1];
    }
}

class Solution{
    private class IntervalComparator implements Comparator<int[]>{
        public int compare(int[] a, int[] b){
            if(a[0]<b[0]) return -1;
            else if(a[0]== b[0]) return 0;
            else return 1;
        }
    }

    public int[][] merge(int[][] intervals){
        List<int[]> res=new LinkedList<>();

        if(intervals==null || intervals.length==0) return intervals;
        Arrays.sort(intervals,new IntervalComparator());
        for(int[] i: intervals){
            if(res.isEmpty() || (((LinkedList<int[]>) res).getLast())[1]<i[0]){
                res.add(i);
            }else {
                (((LinkedList<int[]>) res).getLast())[1]=Math.max(
                        (((LinkedList<int[]>) res).getLast())[1],i[1]);
            }

        }

        int[][] ans=new int[res.size()][];
        return res.toArray(ans);
    }
}