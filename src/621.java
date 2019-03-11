class Solution {
    public int leastInterval(char[] tasks, int n) {
        int max = 0;
        int countMax = 0;
        int[] freq = new int[26];
        
        for(char task: tasks){
            freq[task-'A']++;
            if(max < freq[task-'A']){
                max = freq[task-'A'];
                countMax = 1;
            }
            else if(max == freq[task-'A']){
                countMax++;
            }
        }
        
        int numOfParts = max - 1;
        int idlePerSlot = n + 1 - countMax;
        int totalIdleSlot = numOfParts * idlePerSlot;
        int remainIdle = Math.max(0, totalIdleSlot - (tasks.length - max * countMax));
        return tasks.length + remainIdle;        
    }
}
