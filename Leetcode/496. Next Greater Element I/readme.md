# [Next Greater Element I](https://leetcode.com/problems/next-greater-element-i/)

The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.

Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.

## Sample
Input: 
```
nums1 = [4,1,2], nums2 = [1,3,4,2]
```
Output: 
```
[-1,3,-1]
```
## Test case explanation
**4** is the maximum value in the entire list so no greater element is possible.  
**3** is on the immediate right of 1 and is also greater than 1 so it is the next greater element  
**2** is at the end of the list so no greater element is possible

## Brute Force Approach ( O(n*n) Time complexity and O(1) space complexity)
1. Iterate through the search array
2. Find the index of the element in the larger array **(Linear Search O(n))**
3. Iterate through the larger array starting from index found in step 2 till the end of the array.
4. If a larger element is found update the value and exit from the inner loop else set -1 if end of list is reached.
5. Repeat steps 2-4 till the search array is completely traversed.
  
**[Code](https://github.com/AaveshK/Programming/blob/master/Leetcode/496.%20Next%20Greater%20Element%20I/NEG1Brute.java)**  
**Runtime: 8ms (20.60%), Memory: 38.9MB (94.05%)**  

## Optimal Approach ( O(n) Time complexity and space complexity)
1. An empty map and stack is declared
2. Elements of the larger array is inserted into a stack
3. While inserting, if the next element to be inserted is greater than the elements present in the stack, they are popped and inserted into the map with the key as popped element and the value as the next element to be inserted in the stack
4. Steps 2,3 are repeated till the entire array has been traversed.
5. The array containing search elements is traversed and the value is replaced by the corresponding value in the map if present else -1.
  
**[Code](https://github.com/AaveshK/Programming/blob/master/Leetcode/496.%20Next%20Greater%20Element%20I/NGE1Optimal.java)**  
**Runtime: 4ms (62.83%), Memory: 39MB (87.08%)**  