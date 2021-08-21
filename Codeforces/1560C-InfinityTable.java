/*

Sample Input 1

7
11
14
5
4
1
2
1000000000

Sample Output 1

2 4
4 3
1 3
2 1
1 1
1 2
31623 14130

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class InfinityTable
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
            int N = Integer.parseInt(in.readLine());
            int x =(int) Math.sqrt(N);
            if(x * x == N)
                System.out.println(x+" 1");
            else
                {
                    //x = x + 1;
                    if((N- x*x)<(x+1))
                        System.out.println(N-x*x+" "+(x+1));
                    else
                        {
                            x++;
                            System.out.println(x+" "+((x*x)-N+1));
                        }
                }
        }
	}
}