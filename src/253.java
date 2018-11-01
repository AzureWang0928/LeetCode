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
    public int minMeetingRooms(Interval[] intervals) {
        if(intervals == null || intervals.length ==  0){
            return 0;
        }
        Arrays.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval a, Interval b){
                return a.start - b.start;
            }
        });
        
        PriorityQueue<Interval> pq = new PriorityQueue<Interval>(new Comparator<Interval>(){
           public int compare(Interval a, Interval  b){
                return a.end - b.end; 
           } 
        });
        pq.offer(intervals[0]); 
        for(int i  = 1; i < intervals.length;  i++){
            Interval interval = pq.poll();
            System.out.println(interval.end);
            if(interval.end <= intervals[i].start){
                interval.end = intervals[i].end;
            }
            else{
                pq.offer(intervals[i]);
            }
            pq.offer(interval);
        }
        
        return pq.size();
    }
}


public class Solution {
    public int minMeetingRooms(Interval[] intervals) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>(); // Sort Key based on nature order
        for (Interval i : intervals) {
            if (map.containsKey(i.start)) {
                map.put(i.start, map.get(i.start)+1);
            } else {
                map.put(i.start, 1);
            }
            if (map.containsKey(i.end)) {
                map.put(i.end, map.get(i.end)-1);
            } else {
                map.put(i.end, -1);
            }
        }
        int maxRoom = 0; int curRoom = 0;
        for (int i : map.keySet()) {
            maxRoom = Math.max(maxRoom, curRoom += map.get(i));
        }
        return maxRoom;
    }
}
