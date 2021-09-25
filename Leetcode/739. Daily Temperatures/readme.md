# [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/)

Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.

## Sample
Input: 
```
temperatures = [73,74,75,71,69,72,76,73]
```
Output: 
```
[1,1,4,2,1,1,0,0]
```
## Test case explanation
**73** has a strictly greater element on its immediate right which is 74   
**74** has a strictly greater element on its immediate right which is 75  
For **75** the next greater element is 76 which is at 7th position (7-3=4)  
72 is the next higher for both **71** and **69**  
76 is next higher for **72**  
No higher element is present for **76** and **73**

## Observation
Last element is always 0.  

## Brute Force Approach
1. Iterate through temperatures
2. Find the next greater element. If found, the difference in indices replaces the array element and flag is set to 1.
3. If flag value is still 0, that means no greater element present, hence replace with 0.
4. Repeat steps 2,3 for each array element.
  
**[Code](https://github.com/AaveshK/Programming/blob/master/Leetcode/739.%20Daily%20Temperatures/DTBrute.java)**  
**Runtime: 1024ms (12.36%), Memory: 53.7 MB (35.99%)**  

## Optimal Approach
1. An empty stack and array are declared
2. Given indices of temperature are inserted into the stack
3. While inserting, if the value at the new index is greater than the elements present at indices in stack, they are popped and the empty array stores the difference in indices at the popped index.
4. Steps 2,3 are repeated till the entire temperature array has been traversed.  
### Note
Since the elements without any next greater elements should return 0, an empty array ensures that the values not being popped are 0 by default. Else At the end of iteration, we can also pop the elements in stack and replace its index with 0, to achieve in place replacement.  

**[Code(Extra array)](https://github.com/AaveshK/Programming/blob/master/Leetcode/739.%20Daily%20Temperatures/DTOptimalStack.java)**  
**Runtime: 35 ms (61.66%), Memory: 48.4 MB (86.69%)**  

**[Code(In place)](https://github.com/AaveshK/Programming/blob/master/Leetcode/739.%20Daily%20Temperatures/DTOptimalStackinplace.java)**  
**Runtime: 36 ms (58.67%), Memory: 51.6 MB (41.09%)**  