/*

Sample Input 1

40047

Sample Output 1

NO

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class NearlyLuckyNumber
{
    static int max(int x, int y){return ((x > y) ? x : y );}
    static int min(int x, int y){return ((x < y) ? x : y );}
    static int sum(int[] A){int sum = 0;for(int i=0; i<A.length; i++)sum+=A[i];return (sum);}
    static int gcd(int a, int b){if (b == 0)return a;return gcd(b, a % b);}
    public static void main (String[] args) throws IOException
	{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(in.readLine());
        int count = 0;
		while(N > 0)
		{
            if(N % 10 == 4 || N % 10 ==7)
                count++;
            N = N/10;
        }
        if(count == 4 || count == 7)
            System.out.println("YES");
        else
            System.out.println("NO");
	}
}