/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        intervals.sort(new Comparator<Interval>() {
            @Override
            public int compare(Interval m1, Interval m2) {
                return m1.start>m2.start?1:m1.start==m2.start?0:-1;
             }
        });
        
        List<Interval> ans = new LinkedList<Interval>();
        int count=0;
        if (intervals.isEmpty()) return intervals;
        for(Interval interval: intervals){
            if(ans.isEmpty()||interval.start>ans.get(count-1).end){
                ans.add(interval);
                count++;
            } 
            else {
                ans.get(count-1).end=Math.max(interval.end,ans.get(count-1).end);
            }
        }
        return ans;
    }
}