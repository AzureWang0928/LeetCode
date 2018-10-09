class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        for (int num: nums){
            if(!set.contains(num)){
                pq.offer(num);
                set.add(num);
                if(pq.size()>3){
                    set.remove(pq.poll());
                }
            }
        }
        if(pq.size() < 3){
            while(pq.size() > 1){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
