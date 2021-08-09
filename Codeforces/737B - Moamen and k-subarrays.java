/*

Sample Input 1

3
5 4
6 3 4 2 1
4 2
1 -4 0 -2
5 1
1 2 3 4 5


Sample Output 1

Yes
No
Yes

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codeforces
{
public static void main (String[] args) throws IOException
	{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		while(T -- > 0)
		{
            String  lines = in.readLine();    
            String[] strs = lines.trim().split("\\s+");
            int N,k;
            N = Integer.parseInt(strs[0]);
            k = Integer.parseInt(strs[1]);
            long[] A = new long[N];
            lines = in.readLine();    
            strs = lines.trim().split("\\s+");
            int count = 0;
            for(int i = 0; i<N; i++)
            {
                A[i] = Long.parseLong(strs[i]);
            }
            for(int i = 0; i<N-1; i++)
            {
                if(A[i] > A[i+1])
                    count++;
            }
            //System.out.println(count);
            if(count < k && k <= N && k >=1)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
	}
    static int max(int x, int y)
    {
        return ((x > y) ? x : y );
    }
    static int min(int x, int y)
    {
        return ((x < y) ? x : y );
    }
}