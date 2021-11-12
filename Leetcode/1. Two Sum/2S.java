class Solution
{
    public int[] twoSum(int[] nums, int target)
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] ar = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                ar[0] = map.get(target-nums[i]);
                ar[1] = i;
                break;
            }
             else if(!map.containsKey(nums[i]))
                map.put(nums[i],i);
        }
        return ar;
    }
}