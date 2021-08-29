package DSA.SDESheet;

/*

Problem : https://leetcode.com/problems/sort-colors/

Runtime: 0ms (100%)

Memory Usage: 39.2 MB (6.07%)

*/
class Solution
{
    public void sortColors(int[] nums)
    {
        int mid = 0;
        int low = 0;
        int high = nums.length - 1;
        while(mid <= high)
        {
            if(nums[mid] == 0)
            {
                nums[mid++] = nums[low];
                nums[low++] = 0;
            }
            else if(nums[mid] == 1)
            {
                mid++;
            }
            else if(nums[mid] == 2)
            {
                nums[mid] = nums[high];
                nums[high--] = 2;
            }
        }
    }
}