import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		String S = "loveleetcode";
		Map<Character, Integer>lmap = new HashMap<Character, Integer>();
		int i=0, len =S.length();
		char ch;
		while(i<len)
		{
		    ch = S.charAt(i);
		    if(lmap.containsKey(ch))
		        lmap.put(ch, lmap.get(ch)+1);
		    else
		        lmap.put(ch,1);
		    i++;
		}
		i=0;
		while(i<len)
		{
		    ch = S.charAt(i);
		    if(lmap.get(ch) == 1)
		        {
		            System.out.println(ch);
		            return;
		        }
		        i++;
		}
		System.out.println("-1");
	}
}