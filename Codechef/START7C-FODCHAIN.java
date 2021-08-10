import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		int count=0;
		while(T-- > 0)
		{
		    count = 1;
		    String  lines = in.readLine();    
            String[] strs = lines.trim().split("\\s+");
            int E = Integer.parseInt(strs[0]);
            int K = Integer.parseInt(strs[1]);
            while(Math.floor(E/K)>=1)
            {
                E=E/K;
                count++;
            }
            System.out.println(count);
		}
	}
}