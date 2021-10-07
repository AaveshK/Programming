# [House Robber](https://leetcode.com/problems/house-robber/)

You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

## Sample
Input: 
```
nums = [2,7,9,3,1]
```
Output: 
```
12
```
## Test case explanation
The maximum amount of money that can be robbed is by taking the 1st, 3rd and the 5th house (2+9+1)



## Optimal Approach (DP - Bottom up)
1. The base case is taken care of (for N = 1 and 2)
2. An array is required which maintains the maximum money robbed till that house
3. For each house i (i > 2), we can either skip that house if the adjacent house (i-1) was robbed, or we can rob it along with the next to adjacent house (i-2)
4. The maximum values of the two in step 3 is taken
5. Iteration stops when the last house is reached
  
**[Code](https://github.com/AaveshK/Programming/blob/master/Leetcode/198.%20House%20Robber/HROptimal.java)**  
**Runtime: 0 ms (100%), Memory: 36.2 MB (87.35%)**  