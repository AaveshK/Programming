/*

Sample Input 1

4
10 5 5
10 6 5
10 4 5
10 8 5

Sample Output 1

2
4
9
8

*/

//import java.util.*;
//import java.lang.*;
import java.io.*;


class CHFINVNT
{
    public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		while(T -- > 0)
		{
            String  lines = in.readLine();    
            String[] strs = lines.trim().split("\\s+");
            long N = Long.parseLong(strs[0]);
            long p = Long.parseLong(strs[1]);
            long K = Long.parseLong(strs[2]);
            /*int N = Integer.parseInt(strs[0]);
            int p = Integer.parseInt(strs[1]);
            int K = Integer.parseInt(strs[2]);*/
            long count = 0;
            long i = 0;
            long x = p % K;
            long y = (N-1) - ((N-1)/K * K);
            if(x > y)
                count = (N-1)/K * x + y +1;
            else
                count = ((N-1)/K +1 ) * x;
            
            for(i = x; i<N; i=i+K)
            {
                count++;
                if(i == p)
                    break;
            }
            System.out.println(count);
        }
	}
}