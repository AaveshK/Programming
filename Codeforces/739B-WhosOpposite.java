/*

Sample Input 1

7
6 2 4
2 3 1
2 4 10
5 3 4
1 3 2
2 5 4
4 3 2

Sample Output 1

8
-1
-1
-1
4
1
-1

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class WhosOpposite
{
    static int max(int x, int y){return ((x > y) ? x : y );}
    static int min(int x, int y){return ((x < y) ? x : y );}
    static int sum(int[] A){int sum = 0;for(int i=0; i<A.length; i++)sum+=A[i];return (sum);}
    static int gcd(int a, int b){if (b == 0)return a;return gcd(b, a % b);}
    public static void main (String[] args) throws IOException
	{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		while(T -- > 0)
		{
            String  lines = in.readLine();    
            String[] strs = lines.trim().split("\\s+");
            int a = Integer.parseInt(strs[0]);
            int b = Integer.parseInt(strs[1]);
            int c = Integer.parseInt(strs[2]);
            int x = Math.abs(a-b);
            int d = c + x;
            if(d > 2*x)
                d = c - x;
            if(a > 2*x || b > 2*x || c > 2*x)
                System.out.println("-1");
            else
                System.out.println(d);
        }
	}
}