/*

Sample Input 1

10
1
2
3
4
5
6
7
8
9
1000

Sample Output 1

1
2
4
5
7
8
10
11
14
1666

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class DislikeofThree
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
            int count = 0;
            int num = 0;
            for(int i=0; count<N; i++)
            {
                if(i % 3 == 0 || i % 10 == 3)
                    continue;
                else
                    {num = i;count++;}
            }
            System.out.println(num);
        }
	}
}