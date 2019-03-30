/*
 *Time complexity O(NlogK)
 */
class Solution {
    public int[][] kClosest(int[][] points, int K) {
        Queue<int[]> queue = new PriorityQueue<int[]>((b, a)->(a[0]*a[0] + a[1]*a[1]) - b[0]*b[0] - b[1]*b[1]);
        int[][] ans = new int[K][2];
        for(int i = 0; i < points.length; i++){
            queue.offer(points[i]);
            if(queue.size() > K){
                queue.poll();
            }
        }
        while(K > 0){
            ans[--K] = queue.poll();
        }
        return ans;
    }
}
