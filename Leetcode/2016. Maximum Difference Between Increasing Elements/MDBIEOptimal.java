class Solution
{
    public int maximumDifference(int[] nums)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
            max = Math.max(max,nums[i] - min);
            if(nums[i] < min)
                min = nums[i];
        }
        return max > 0 ? max : -1;
    }
}