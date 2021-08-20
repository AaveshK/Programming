/*

Sample Input 1

6
1000
30
1
32
1000000000
5

Sample Output 1

334 333
10 10
1 0
10 11
333333334 333333333
1 2

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class PolycarpandCoins
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
            int c1, c2;
            c1 = c2 = N/3;
            if(N % 3 == 1)
                c1++;
            else if(N % 3 == 2)
                c2++;
            System.out.println(c1+" "+c2);
        }
	}
}