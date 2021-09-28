class Solution
{
    public int[] sortArrayByParityII(int[] nums)
    {
        int odd = 1;
        int even = 0;
        while(true)
        {
            while(even < nums.length  && nums[even] %2 == 0)
                even+=2;
            while(odd < nums.length && nums[odd] %2 != 0)
                odd+=2;
            if(even > nums.length || odd > nums.length)
                break;
            swap(nums,even,odd);
        }
        return nums;
    }
    static void swap(int[] ar, int a, int b)
    {
        int temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
    }
}