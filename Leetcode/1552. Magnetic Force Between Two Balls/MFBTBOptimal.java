class Solution
{
    public int maxDistance(int[] coord, int m)
    {
        Arrays.sort(coord);
        int n = coord.length;
        int lb = 1;
        int ub = coord[n-1] - coord[0];
        int ret = 0;
        while(lb <= ub)
        {
        	int mid = lb + (ub - lb+1)/2;
        	if(canPlace(coord, m, mid))
        	{
        		ret = mid;
        		lb = mid+1;
        	}
        	else
        	{
        		ub = mid - 1;
        	}
        }
        return ret;
    }
    static boolean canPlace(int[] coord, int basket, int dist)
	{
		int count = 1;
		int lastPlaced = coord[0];
		for(int i = 1; i < coord.length; i++)
		{
			if(coord[i] - lastPlaced >= dist)
			{
				count++;
				lastPlaced = coord[i];
			}
			if(count == basket)
				return true;
		}
		return false;
	}
}