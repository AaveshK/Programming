class Solution
{
    public int rob(int[] nums)
    {
        int N = nums.length;
        int[] max = new int[N];
        if(N >= 1)
            max[0] = nums[0];
        if(N >= 2)
            max[1] = Math.max(nums[0],nums[1]);
        for(int i = 2; i < N; i++)
        {
            max[i] = Math.max(max[i-1],max[i-2]+nums[i]);
        }
        return max[N-1];
    }
}