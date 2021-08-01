char firstNotRepeatingCharacter(String s)
{
		Map<Character, Integer>lmap = new LinkedHashMap<Character, Integer>();
		int i=0, len =s.length();
		while(i<len)
		{
		    char ch = s.charAt(i);
		    if(lmap.containsKey(ch))
		        lmap.put(ch, lmap.get(ch)+1);
		    else
		        lmap.put(ch,1);
		    i++;
		}
		Set<Character> keys = lmap.keySet();
		for (Character key : keys)
		{
		    if(lmap.get(key) == 1)
		        {
		            return key;
		        }
		}
		return '_';
}