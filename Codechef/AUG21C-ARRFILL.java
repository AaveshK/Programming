/*

Sample Input 1

3
10 1
5 2
8 2
5 2
6 3
3 2
2 2
1 3


Sample Output 1

25
41
5

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static int max(int x, int y){return ((x > y) ? x : y );}
    static int min(int x, int y){return ((x < y) ? x : y );}
    static int sum(int[] A){int sum = 0;for(int i=0; i<A.length; i++)sum+=A[i];return (sum);}
    static long gcd(long a, long b){if (b == 0)return a;return gcd(b, a % b);}
    public static void main (String[] args) throws IOException
	{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		while(T -- > 0)
		{
            String  lines = in.readLine();
            String[] strs = lines.trim().split("\\s+");
            long N = Long.parseLong(strs[0]);
            int M = Integer.parseInt(strs[1]);

            Map<Long, Long> treemap = new TreeMap<Long, Long>(Collections.reverseOrder());
            for(int j = 0; j<M; j++)
            {
                lines = in.readLine();
                strs = lines.trim().split("\\s+");
                treemap.put(Long.parseLong(strs[0]),Long.parseLong(strs[1]));
            }

            Set set = treemap.entrySet();
            Iterator i = set.iterator();

            long lcm=1, rem=N, ans=0;
            //for(int j =0; j< M && rem > 0; j++)
            while(i.hasNext() && rem > 0)
            {
                Map.Entry me = (Map.Entry)i.next();
                long a = (long) me.getKey(), b = (long) me.getValue();
                //System.out.println(a + " "+b);
                lcm = lcm* b / gcd(lcm,b);
                ans = ans + (rem-N/lcm)*a;
                rem = N/lcm;
            }
            System.out.println(ans);
        }
	}
}