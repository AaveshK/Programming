class Solution
{
    public int[] nextGreaterElement(int[] nums1, int[] nums2)
    {
        for(int i = 0; i < nums1.length; i++)
        {
            int loc = search(nums2, nums1[i]);
            for(int j = loc; j < nums2.length; j++)
            {
                if(nums2[j] > nums1[i])
                {
                    nums1[i] = nums2[j];
                    break;
                }
                if(j == nums2.length-1)
                    nums1[i] = -1;
            }
        }
        return nums1;
    }
    int search(int[] ar, int elem)
    {
        for (int i = 0 ;i< ar.length; i++)
        {
            if(ar[i]==elem)
            {
                return i;
            }
        }
        return -1;
    }
}