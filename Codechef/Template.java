/*

Sample Input 1



Sample Output 1



*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Template
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
            int[] A = new int[strs.length];
            for(int i = 0; i<3; i++)
            {
                A[i] = Integer.parseInt(strs[i]);
            }
        }
	}
}