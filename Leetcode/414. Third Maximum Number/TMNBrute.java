class Solution
{
    public int thirdMax(int[] nums)
    {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for(int i : nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        if(map.size() < 3)
            return nums[nums.length-1];
        int count = 0;
        for(int i : map.keySet())
        {
            count++;
            if(count == 3)
                return(i);
        }
        return 0;
    }
}