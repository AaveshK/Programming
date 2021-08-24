/*

Sample Input 1

12

Sample Output 1

3

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Elephant
{
    static int max(int x, int y){return ((x > y) ? x : y );}
    static int min(int x, int y){return ((x < y) ? x : y );}
    static int sum(int[] A){int sum = 0;for(int i=0; i<A.length; i++)sum+=A[i];return (sum);}
    static int gcd(int a, int b){if (b == 0)return a;return gcd(b, a % b);}
    public static void main (String[] args) throws IOException
	{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(in.readLine());
        if(x%5 == 0)
            x = x/5;
        else
            x = x/5 + 1;
        System.out.println(x);
	}
}