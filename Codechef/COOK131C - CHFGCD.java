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
		    int count = 0;
            String  lines = in.readLine();    
            String[] strs = lines.trim().split("\\s+");
            int x = Integer.parseInt(strs[0]);
            int y = Integer.parseInt(strs[1]);
            
            int ans;
            if(x%2 == 0 && y % 2 ==0)
                ans = 0;
            else if(gcd(x,y) != 1)
                ans = 0;
            else if(gcd(x+1,y) > 1 || gcd(x, y+1) > 1)
                ans = 1;
            else
                ans = 2;
            System.out.println(ans);
		}
	}
	static int gcd(int a, int b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b);
    }
}