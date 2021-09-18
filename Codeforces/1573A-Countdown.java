/*

Sample Input 1

7
3
007
4
1000
5
00000
3
103
4
2020
9
123456789
30
001678294039710047203946100020

Sample Output 1

7
2
0
5
6
53
115

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Countdown
{
    static int max(int x, int y){return ((x > y) ? x : y );}
    static int min(int x, int y){return ((x < y) ? x : y );}
    static int sum(int[] A){int sum = 0;for(int i=0; i<A.length; i++)sum+=A[i];return (sum);}
    static int gcd(int a, int b){if (b == 0)return a;return gcd(b, a % b);}
    static boolean isPowerOfTwo(int n){if(n==0)return false;return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==(int)(Math.floor(((Math.log(n) / Math.log(2)))));}
    static int countDigits(long l)
    {
            if (l >= 1000000000000000000L) return 19;
            if (l >= 100000000000000000L) return 18;
            if (l >= 10000000000000000L) return 17;
            if (l >= 1000000000000000L) return 16;
            if (l >= 100000000000000L) return 15;
            if (l >= 10000000000000L) return 14;
            if (l >= 1000000000000L) return 13;
            if (l >= 100000000000L) return 12;
            if (l >= 10000000000L) return 11;
            if (l >= 1000000000L) return 10;
            if (l >= 100000000L) return 9;
            if (l >= 10000000L) return 8;
            if (l >= 1000000L) return 7;
            if (l >= 100000L) return 6;
            if (l >= 10000L) return 5;
            if (l >= 1000L) return 4;
            if (l >= 100L) return 3;
            if (l >= 10L) return 2;
            return 1;
    }
    static void sort2D(int[][] Arr){Arrays.sort(Arr, (a, b) -> Double.compare(a[0], b[0]));}
    public static void main (String[] args) throws IOException
	{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
        while( T -- > 0)
        {
            int N = Integer.parseInt(in.readLine());
            String s = in.readLine();
            // String[] strs = lines.trim().split("\\s+");
            int cmin = 0;
            for(int i = 0; i < N; i++)
            {
                int ch = s.charAt(i) - 48;
                if(i != N-1 && ch != 0)
                {
                    cmin++;
                    cmin += ch;
                }
                else if(ch != 0)
                    cmin+=ch;
            }
            System.out.println(cmin);
        }
	}
}