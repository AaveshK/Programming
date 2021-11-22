class Solution
{
    public int maxDistance(int[] colors)
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < colors.length - 1; i++)
        {
            int current = 0;
            for(int j = i+1; j < colors.length; j++)
            {
                if(colors[j] != colors[i])
                    current = j - i;
                if(max <= current)
                    max = current;
            }
        }
        return max;
    }
}