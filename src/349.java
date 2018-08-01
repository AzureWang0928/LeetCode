class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i=0;i<nums1.length;i++)
            set1.add(nums1[i]);
        for(int j=0;j<nums2.length;j++)
            set2.add(nums2[j]);
         
        Set<Integer> result = new HashSet<>(set1);
		result.retainAll(set2);
        int[] array = new int[result.size()];
        int k = 0;
		Iterator<Integer> it = result.iterator();
		while(it.hasNext()) {
			array[k] = it.next();
			k++;
		}
        return array;
    }
}