/*

Sample Input 1

code
edoc

Sample Output 1

YES

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Translation
{
    static int max(int x, int y){return ((x > y) ? x : y );}
    static int min(int x, int y){return ((x < y) ? x : y );}
    static int sum(int[] A){int sum = 0;for(int i=0; i<A.length; i++)sum+=A[i];return (sum);}
    static int gcd(int a, int b){if (b == 0)return a;return gcd(b, a % b);}
    public static void main (String[] args) throws IOException
	{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String bir =  in.readLine();
        String sb= new StringBuilder(bir).reverse().toString();  
        String ber =  in.readLine();
        if(sb.compareTo(ber) == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
	}
}