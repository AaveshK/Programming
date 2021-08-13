/*

Sample Input 1

6
ADAAAA

Sample Output 1

Anton

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class AntonAndDanik
{
    static int max(int x, int y){return ((x > y) ? x : y );}
    static int min(int x, int y){return ((x < y) ? x : y );}
    static int sum(int[] A){int sum = 0;for(int i=0; i<A.length; i++)sum+=A[i];return (sum);}
    static int gcd(int a, int b){if (b == 0)return a;return gcd(b, a % b);}
    public static void main (String[] args) throws IOException
	{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
        String  result = in.readLine();
        int count = 0;
        for(int i = 0; i< T; i++)
        {
            if(result.charAt(i) == 'A')
                count++;
        }
        if(count*2 == T)
            System.out.println("Friendship");
        else if(count > T/2)
            System.out.println("Anton");
        else
            System.out.println("Danik");
	}
}