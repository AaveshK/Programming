class Solution
{
    public int findKthNumber(int m, int n, int k)
    {
        int id = 0;
        int[] ar = new int[m*n];
        for(int i = 1; i <= m; i++)
        {
            for(int j = 1; j <= n; j++)
                ar[id++] = i * j;
        }
        Arrays.sort(ar);
        return ar[k-1];
    }
}