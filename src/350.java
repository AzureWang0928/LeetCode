//best solution
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i1 = 0, i2 = 0, i = 0;
        int[] arr = new int[nums1.length > nums2.length ? nums2.length : nums1.length];
        while (i1 < nums1.length && i2 < nums2.length && i < arr.length) {
            if (nums1[i1] > nums2[i2]) {
                i2++;
            }
            else if (nums1[i1] < nums2[i2]) {
                i1++;
            }
            else {
                arr[i] = nums1[i1];
                i++;
                i1++;
                i2++;
            }
        }
        return Arrays.copyOf(arr, i);
    }
}


//my solution
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for(int i=0;i<nums2.length;i++){
            freq.put(nums2[i], freq.getOrDefault(nums2[i], 0)+1);
        }
        for(int i=0;i<nums1.length;i++){
            if(freq.containsKey(nums1[i]) && (freq.get(nums1[i])>0)){
                ans.add(nums1[i]);
                freq.put(nums1[i], freq.get(nums1[i])-1);
            }
        }
        int res[] = new int[ans.size()];
        if(ans.size()>0){
            for(int i=0;i<ans.size();i++){
                res[i] = ans.get(i);
            }
        }
        return res;
    }
}
