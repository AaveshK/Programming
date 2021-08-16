/*

Sample Input 1

4
2
1 2
3
1 1 3
4
3 11 3 7
5
11 7 15 3 7

Sample Output 1

0
1
3
3

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class MochaAndMath
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
            int N = Integer.parseInt(in.readLine());
            String  lines = in.readLine();    
            String[] strs = lines.trim().split("\\s+");
            //int[] A = new int[N];
            int ans = Integer.parseInt(strs[0]);;
            for(int i = 1; i<N; i++)
            {
                int temp = Integer.parseInt(strs[i]);
                //A[i] = Integer.parseInt(strs[i]);
                ans = ans & temp;
            }
            System.out.println(ans);
        }
	}
}