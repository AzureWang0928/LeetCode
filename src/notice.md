###### 2
1. overflow for int type
2. l1 = l1==null?l1:l1.next;
3. return result.next;

###### 3
1. Refer [website](https://leetcode.com/problems/longest-substring-without-repeating-characters/solution/) to learn.
2. sliding window is the key point to improve the performance.

###### 26

1. To get the length of the array, we use array.length, while for string, we use `str.length()`
1. Use a count var to store the length

###### 27
1. judge not equal and fill them into the original array instead of judging the equal elements

###### 28

1. Judge the boundary conditions when the length of needle is 0.
2. `subString()` method is the highlights of this problem.


###### 35

1. Time complexity is O(logn) by using binary search

##### 53

1. Dynamic Programming is the most important part of this problems.
2. Divide and Conquer is the efficient way to improve the complexity from o(n) to o(logn)

##### 70

As we can see this problem can be broken into subproblems, and it contains the optimal substructure property i.e. its optimal solution can be constructed efficiently from optimal solutions of its subproblems, we can use dynamic programming to solve this problem.
One can reach i step in one of the two ways:

Taking a single step from (i-1) step.

Taking a step of 22 from (i-2) step.

So, the total number of ways to reach i step:

dp[i]=dp[i-1]+dp[i-2]

#####110
1. Judge empty tree
2. Judge the height of left and right is over 1
3. Judge left sub tree and right sub tree is balanced

##### 141
1. Use two pointers, a fast one and a slow one (general solution for cycle)

###### 389

1. Use ASCII to solve the problem

