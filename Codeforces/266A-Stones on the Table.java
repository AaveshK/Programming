/*

Sample Input 1

3
RRG

Sample Output 1

1

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codeforces
{
    static int max(int x, int y){return ((x > y) ? x : y );}
    static int min(int x, int y){return ((x < y) ? x : y );}
    static int sum(int[] A){int sum = 0;for(int i=0; i<A.length; i++)sum+=A[i];return (sum);}
    static int gcd(int a, int b){if (b == 0)return a;return gcd(b, a % b);}
    public static void main (String[] args) throws IOException
	{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		String s = in.readLine();
        int count = 0;
        for(int i = 1; i<N; i++)
        {
            if(s.charAt(i-1) == s.charAt(i))
                count++;
        }
        System.out.println(count);
	}
}