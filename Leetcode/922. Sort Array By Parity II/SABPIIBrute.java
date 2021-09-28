class Solution
{
    public int[] sortArrayByParityII(int[] nums)
    {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for(int i : nums)
            if(i % 2 == 0)
                even.add(i);
            else
                odd.add(i);
        int j = 0;
        for(int i = 0; i < nums.length; i+=2)
        {
            nums[i] = even.get(j++);
        }
        j = 0;
        for(int i = 1; i < nums.length; i+=2)
            nums[i] = odd.get(j++);
        return nums;
    }
}