# [Reverse Integer](https://leetcode.com/problems/reverse-integer/)

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

**Assume the environment does not allow you to store 64-bit integers (signed or unsigned).**

## Sample
Input: 
```
123
-123
120
0
-2147483648
```
Output: 
```
321
-321
21
0
0
```
## Test case explanation
For -2147483648, the reversed value would be -8463847412 which is beyond the Integer.MIN_VALUE limit (-2147483648), hence the value returned should be 0.

## Approach
1. Have an empty variable of integer type (no long as per the question) to store the reversed number.
2. Extract the last digit and keep adding it to the unit's place  in the variable while removing the digit from the given variable.
3. If the now reversed value is higher than 214748364 (which is Integer.MAX_VALUE excluding the last digit) or lower than -214748364, then after the next digit is added, it will cause overflow, for which the value returned has to be 0.
4. Steps 2,3 are repeated until the original number becomes 0 or overflow condition is encountered.
  
**[Code](https://github.com/AaveshK/Programming/blob/master/Leetcode/7.%20Reverse%20Integer/RIOptimal.java)**  
**Runtime: 1ms (100%), Memory: 36MB (85.13%)**  