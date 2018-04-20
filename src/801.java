class Solution {
    public int minSwap(int[] A, int[] B) {
        int n1 = 0; //  ni表示  n(i-1)不需要交换就已经是有序的了
        int s1 = 1; // si 代表s(i-1) 在i - 1处交换一次就有序了
        // 那么 以上推测， n1 = 0 s1 = 1 很明显，index 0处肯定是有序的
        // index o 处 交换一次肯定也是有序的， 因为他们是第一个元素嘛

        for (int i = 1; i < A.length; i++) {
            // 以下是推测 n2 s2的过程
            int n2 = Integer.MAX_VALUE;
            int s2 = Integer.MAX_VALUE;
            // 
            if (A[i - 1] < A[i] && B[i - 1] < B[i]) {
                n2 = Math.min(n2, n1);
                s2 = Math.min(s2, s1 + 1);
            }
            if (A[i - 1] < B[i] && B[i - 1] < A[i]) {
                n2 = Math.min(n2, s1);
                s2 = Math.min(s2, n1 + 1);
            }

            n1 = n2;
            s1 = s2;
        }
        return Math.min(n1, s1);
    }
}