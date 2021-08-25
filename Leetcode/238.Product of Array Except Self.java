/*
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
*/


class Solution {
    public int[] productExceptSelf(int[] nums)
    {
        int N = nums.length;
        int prod=1;
        int prod0=1;
        int count0 = 0;
        for(int i = 0; i < N; i++)
        {
            prod0 = prod0 * nums[i];
            if(nums[i] == 0)
                count0++;
            else
                prod = prod * nums[i];
        }
        for(int i = 0; i< N; i++)
        {
            if(count0 > 1)
                nums[i] = 0;
            else
            {
                if(nums[i] == 0)
                    nums[i] = prod;
                else
                    nums[i] = prod0/nums[i];
            }
        }
        return nums;
    }
}