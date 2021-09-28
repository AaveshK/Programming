# [922. Sort Array By Parity II](https://leetcode.com/problems/sort-array-by-parity-ii/)

Given an array of integers nums, half of the integers in nums are odd, and the other half are even.

Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.

Return any answer array that satisfies this condition.

## Sample
Input: 
```
[4,2,5,7]
```
Output: 
```
[4,5,2,7]
```
## Test case explanation
Any combination of odd numbers at odd indices and even numbers at even position is accepted.

  

## Brute Force Approach
1. Odd and even data are inserted to two different lists
2. Data from the list containing even values is replaced at the even indices
3. Data from the list containing odd values are replaced at odd indices
4. The array is returned.
  
**[Code](https://github.com/AaveshK/Programming/blob/master/Leetcode/922.%20Sort%20Array%20By%20Parity%20II/SABPIIBrute.java)**  
**Runtime: 4 ms (41.17 %), Memory: 43.6 MB (36.31 %)**  

## Optimal Approach
1. Two pointers are initialized with 0 for the even pointer and 1 for the odd pointer
2. Even pointer is increased by two until an odd element is found at even index
3. Odd pointer is increased by two until an even element is found at odd index
4. The array element at the odd pointer is swapped with that at the even pointer
5. Steps 2-4 are repeated until either of the two pointers exceeds the array size
6. The array is returned 
  


**[Code](https://github.com/AaveshK/Programming/blob/master/Leetcode/922.%20Sort%20Array%20By%20Parity%20II/SAPBIIOptimal.java)**  
**Runtime: 2 ms (99.65 %), Memory: 40 MB (90.22 %)**  