class Solution
{
    public int[] maximumBeauty(int[][] items, int[] queries)
    {
        Arrays.sort(items, (a,b)->a[0]-b[0]);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int max = 0;
        for(int i = 0; i < items.length; i++)
        {
            if(items[i][1] > max)
                max = items[i][1];
            map.put(items[i][0],max);
        }
        for(int i = 0; i < queries.length; i++)
        {
            if(map.containsKey(queries[i]))
                queries[i] = map.get(queries[i]);
            else
            {
                if(map.lowerKey(queries[i]) != null)
                    queries[i] = map.get(map.lowerKey(queries[i]));
                else
                    queries[i] = 0;
            }
        }
        return queries;
    }
}