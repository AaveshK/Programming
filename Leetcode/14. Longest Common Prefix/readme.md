# [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/)

Write a function to find the longest common prefix string amongst an array of strings.

## Sample
```
Input: strs = ["flower","flow","flight"]  
Output: "fl"  
```

## Brute force approach
1. Store the first character of the first array element
2. Iterate through every array element to see if it's present at the first index
3. If not present, return the string excluding last character
4. Add the next character of the first array element and repeat steps 2-3 till either the first string is completely traversed or already returned previously.  
**[Code](https://github.com/AaveshK/Programming/blob/master/Leetcode/14.%20Longest%20Common%20Prefix/LCprefixBrute.java)**  
**Runtime: 9ms, Memory: 39.1MB**
## Optimal Approach [Credits](https://www.youtube.com/watch?v=bl8ue-dTxgs)
1. Store the first array element
2. Compare it to the next element.
3. If present at the first index, move to the next array element.
4. Else remove a character and check if the above condition is true.
5. If array is empty, return blank string else return the string remaining after the above iteration  
**[Code](https://github.com/AaveshK/Programming/blob/master/Leetcode/14.%20Longest%20Common%20Prefix/LCprefixOptimal.java)**  
**Runtime: 0ms, Memory: 37.5MB**  