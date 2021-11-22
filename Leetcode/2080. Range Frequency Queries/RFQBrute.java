// TLE
class RangeFreqQuery
{
    int[] arr;
    public RangeFreqQuery(int[] arr)
    {
        this.arr = arr;
    }
    
    public int query(int left, int right, int value)
    {
        int count = 0;
        for(int i = left; i <= right; i++)
            if(arr[i] == value)
                count++;
        return count;
    }
}