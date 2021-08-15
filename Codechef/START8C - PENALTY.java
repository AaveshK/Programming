/*

Sample Input 1

4
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1
1 0 1 0 0 0 0 0 0 0 
1 1 1 1 1 1 1 1 1 0

Sample Output 1

0
2
1
1

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class PENALTY
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
            int N = strs.length;
            int[] A = new int[N];
            int t1=0, t2=0;
            for(int i = 0; i<N; i+=2)
            {
                A[i] = Integer.parseInt(strs[i]);
                if(A[i] == 1)
                    t1++;

            }
            for(int i = 1; i<N; i+=2)
            {
                A[i] = Integer.parseInt(strs[i]);
                    if(A[i] == 1)
                        t2++;
            }
            if(t1> t2)
                System.out.println("1");
            else if (t1< t2)
                System.out.println("2");
            else
            System.out.println("0");
        }
	}
}