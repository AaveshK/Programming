/*

Sample Input 1

5
1
9
10
34
880055535

Sample Output 1

0
1
1
3
88005553

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class DigitsSum
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
            int ans =  N /10;
            if(N % 10 == 9)
                ans++;
            System.out.println(ans);
        }
	}
}