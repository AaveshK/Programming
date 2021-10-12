class Solution
{
    public int[] nextGreaterElements(int[] nums)
    {
        int N = nums.length;
        int[] temp = new int[2*N];
        for(int i = 0; i < 2*N; i++)
        {
            temp[i] = nums[i % N];
        }
        for(int i = 0; i < N; i++)
        {
            for(int j = i; j < 2*N; j++)
            {
                if(temp[j] > nums[i])
                {
                    nums[i] = temp[j];
                    break;
                }
                if(j >= (i + N))
                {
                    nums[i] = -1;
                    break;
                }
            }
        }
        return nums;
    }
}