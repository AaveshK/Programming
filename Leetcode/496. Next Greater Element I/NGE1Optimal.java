class Solution
{
    public int[] nextGreaterElement(int[] nums1, int[] nums2)
    {
        Stack<Integer> stk = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums2)
        {
            while(!stk.isEmpty() && stk.peek() < i)
                map.put(stk.pop(),i);
            stk.push(i);
        }
        for(int i = 0; i < nums1.length; i++)
        {
            nums1[i] = map.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }
}