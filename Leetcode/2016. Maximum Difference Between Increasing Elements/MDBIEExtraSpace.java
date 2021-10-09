class Solution
{
    public int maximumDifference(int[] nums)
    {
        int[] minAr = new int[nums.length];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] < min)
                min = nums[i];
            minAr[i] = min;
        }
        int max = Integer.MIN_VALUE;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] - minAr[i-1] > max)
                max = nums[i] - minAr[i-1];
        }
        return max > 0 ? max : -1;
    }
}