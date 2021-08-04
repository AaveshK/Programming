import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		String S = "abcabcabc";
		Map<Character, Integer>lmap = new LinkedHashMap<Character, Integer>();
		int i=0, len =S.length();
		while(i<len)
		{
		    char ch = S.charAt(i);
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
		            System.out.println(key);
		            return;
		        }
		}
		System.out.println("-1");
	}
}