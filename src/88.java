class Solution {
    //key points is to fill nums1 from the end
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int count=1;
        int p1=m-1;
        int p2=n-1;
        while (count<=(m+n)){
            if (p1>=0&&p2>=0&&nums1[p1]>nums2[p2]){nums1[m+n-count]=nums1[p1];p1--;}
            else if (p2>=0){nums1[m+n-count]=nums2[p2];p2--;}
            count++;
        }   
    }
}
  