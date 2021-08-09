/*

Sample Input 1

4
3
3 1 2
3
-7 -6 -6
3
2 2 2
4
17 3 5 -3


Sample Output 1

4.500000000
-12.500000000
4.000000000
18.666666667

*/

import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.DecimalFormat;

class Ezzat_737A
{
public static void main (String[] args) throws IOException
	{
        DecimalFormat df = new DecimalFormat("#0.000000000");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		while(T -- > 0)
		{
            int N = Integer.parseInt(in.readLine());
            String  lines = in.readLine();    
            String[] strs = lines.trim().split("\\s+");
            long[] A = new long[N];
            for(int i = 0; i<N; i++)
            {
                A[i] = Long.parseLong(strs[i]);
            }
            double s = sum(A);
            long max_n = maxAr(A);
            s -= max_n;
            s /= (A.length - 1);
            s = s + max_n;
            System.out.println(df.format(s));
        }
	}
    static int max(int x, int y)
    {
        return ((x > y) ? x : y );
    }
    static long maxAr(long[] arr)
    {
        long max = Long.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)
            if(arr[i] > max)
                max = arr[i];
        return max;
    }
    static int min(int x, int y)
    {
        return ((x < y) ? x : y );
    }
    static long sum(long[] A)
    {
        long sum = 0;
        for(int i=0; i<A.length; i++)
        {
            sum+=A[i];
        }
        return (sum);
    }
}