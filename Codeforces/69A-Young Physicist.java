/*

Sample Input 1



Sample Output 1



*/

import java.util.*;
import java.lang.*;
import java.io.*;

class YoungPhysicist
{
    static int max(int x, int y){return ((x > y) ? x : y );}
    static int min(int x, int y){return ((x < y) ? x : y );}
    static int sum(int[] A){int sum = 0;for(int i=0; i<A.length; i++)sum+=A[i];return (sum);}
    static int gcd(int a, int b){if (b == 0)return a;return gcd(b, a % b);}
    public static void main (String[] args) throws IOException
	{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
        int sum0 = 0, sum1 = 0, sum2 = 0;
		while(T -- > 0)
		{
            String  lines = in.readLine();    
            String[] strs = lines.trim().split("\\s+");
            sum0 += Integer.parseInt(strs[0]);
            sum1 += Integer.parseInt(strs[1]);
            sum2 += Integer.parseInt(strs[2]);
        }
        if(sum0 != 0 || sum1 != 0 || sum2 !=0)
            System.out.println("NO");
        else
            System.out.println("YES");
	}
}