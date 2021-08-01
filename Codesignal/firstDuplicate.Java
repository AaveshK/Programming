int firstDuplicate(int[] a)
{
    Map<Integer, Integer> count = new HashMap<>();
    int n = a.length;
    int[]b = new int[n+1];
    for (int i = 0; i < n; i++)
    {
        if (count.containsKey(a[i]))
        {
            if(b[a[i]]>=2)
                continue;
            else
            {
                count.put(a[i], i);
                b[a[i]]++;
            }
        }
        else
        {
            count.put(a[i], Integer.MAX_VALUE);
            b[a[i]] = 1;
        }
    }
    int min = Integer.MAX_VALUE;
    int elem = -1;
    for (Map.Entry<Integer, Integer> entry : count.entrySet())
    {
        if(entry.getValue() < min)
        {
            min = entry.getValue();
            elem = entry.getKey();
        }
    }
    return elem;
}