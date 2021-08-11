/*

Sample Input 1

001001

Sample Output 1

NO

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Football
{
    static int max(int x, int y){return ((x > y) ? x : y );}
    static int min(int x, int y){return ((x < y) ? x : y );}
    static int sum(int[] A){int sum = 0;for(int i=0; i<A.length; i++)sum+=A[i];return (sum);}
    static int gcd(int a, int b){if (b == 0)return a;return gcd(b, a % b);}
    public static void main (String[] args) throws IOException
	{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String  s = in.readLine();
        //int count0 = 0, count1 = 0;
        int count = 1;
        for(int i = 0; i < s.length()-1; i++)
        {
            if(s.charAt(i) == s.charAt(i+1))
                count++;
            else count = 1;
            if(count == 7 )
                {
                    System.out.println("YES");
                    System.exit(0);
                }
        }
        System.out.println("NO");;
	}
}