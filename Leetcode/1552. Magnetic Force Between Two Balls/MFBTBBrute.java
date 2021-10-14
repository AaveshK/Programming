class Solution
{
    public int maxDistance(int[] coord, int m)
    {
        Arrays.sort(coord);
        int ret = 0;
        	for(int i = 1; i < coord[coord.length-1]; i++)
        	{
        		if(!canPlace(coord, m, i))
        		{
        			ret = i-1;
        			break;
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