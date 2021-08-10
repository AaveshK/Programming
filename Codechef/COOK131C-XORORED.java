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

		while(T -- > 0)
		{
            int x = 0;
		    int N = Integer.parseInt(in.readLine());
            String  lines = in.readLine();    
            String[] strs = lines.trim().split("\\s+");
            int[] a = new int[N];
            int min = Integer.parseInt(strs[0]);
            for (int i = 0; i < N; i++)
            {
                a[i] = Integer.parseInt(strs[i]);
                if(a[i] < min)
                    min = a[i];
            }
            for(int i =0; i< N;i ++)
            {
                a[i]= a[i]^min;
                x = x | a[i];
            }
            System.out.println(min+" "+x);
		}
	}
}