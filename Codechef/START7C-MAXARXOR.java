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
		while(T-- > 0)
		{
		    String  lines = in.readLine();    
            String[] strs = lines.trim().split("\\s+");
            long N = Long.parseLong(strs[0]);
            long K = Long.parseLong(strs[1]);
            long M = N-1;
            long shift = (long) Math.pow (2,M);
            long arr = (long) Math.pow (2,N) - 1;
            long sum;
            if(K>shift)
            	sum = 2*arr*shift;
            else
            sum = 2*arr*K;
            System.out.println(sum);
		}
	}
}