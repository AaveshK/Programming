class Solution
{
    public int findLengthOfLCIS(int[] nums)
    {
        int max = 1;
        int cur = 1;
        for(int i = 0; i < nums.length - 1; i++)
        {
            if(nums[i] < nums[i+1])
                cur++;
            else
                cur = 1;
            max = Math.max(max, cur);
        }
        return max;
    }
}