/*

Sample Input 1

5
3 2
5 3
16 18
11 8
8 6

Sample Output 1

2
6
72
24
12

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class XLSQUARE
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
            int N = Integer.parseInt(strs[0]);
            int A = Integer.parseInt(strs[1]);
            int x = (int) Math.floor(Math.sqrt(N));
            System.out.println(x * A);
        }
	}
}