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
            String  lines = in.readLine();    
            String[] strs = lines.trim().split("\\s+");
            int c0=0,c1=0;
            int[] a = new int[3];
            for (int i = 0; i < 3; i++)
            {
                a[i] = Integer.parseInt(strs[i]);
                if(a[i] ==0)
                    c0++;
                else
                    c1++;
            }
            if(c0 > 0 && c1 > 0)
                System.out.println("1");
            else
                System.out.println("0");
		}
	}
}