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
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> ans = new LinkedList<Interval>();
        int newStart = newInterval.start;
        int newEnd = newInterval.end;
        int i=0;
        for(;i<intervals.size()&&intervals.get(i).end<newStart;i++){
            ans.add(intervals.get(i));
        }
        for(;i<intervals.size()&&newEnd>=intervals.get(i).start;i++){
            newStart = Math.min(intervals.get(i).start, newStart);
            newEnd = Math.max(intervals.get(i).end, newEnd);
        }
        ans.add(new Interval(newStart, newEnd));
        
        for(;i<intervals.size();i++){
            ans.add(intervals.get(i));   
        }
        return ans;
    }
}

