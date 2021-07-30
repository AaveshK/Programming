class Solution
{
    public int firstUniqChar(String s)
    {
		Map<Character, Integer>lmap = new HashMap<Character, Integer>();
		int i=0, len =s.length();
		char ch;
		while(i<len)
		{
		    ch = s.charAt(i);
		    if(lmap.containsKey(ch))
		        lmap.put(ch, lmap.get(ch)+1);
		    else
		        lmap.put(ch,1);
		    i++;
		}
		i=0;
		while(i<len)
		{
		    ch = s.charAt(i);
		    if(lmap.get(ch) == 1)
		        {
		            return i;
		        }
		        i++;
		}
		return -1;
	}
}