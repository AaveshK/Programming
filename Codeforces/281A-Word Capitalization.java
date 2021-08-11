/*

Sample Input 1

konjac

Sample Output 1

Konjac

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class WordCapitalization_281A
{
    static int max(int x, int y){return ((x > y) ? x : y );}
    static int min(int x, int y){return ((x < y) ? x : y );}
    static int sum(int[] A){int sum = 0;for(int i=0; i<A.length; i++)sum+=A[i];return (sum);}
    static int gcd(int a, int b){if (b == 0)return a;return gcd(b, a % b);}
    public static void main (String[] args) throws IOException
	{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = in.readLine();
		System.out.println(s.substring(0,1).toUpperCase()+s.substring(1,s.length()));
	}
}