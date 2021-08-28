/*

Sample Input 1

1
5 3
1 2 3 4 5

Sample Output 1

1

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class KMAX2
{
    static int MAX(int x, int y){return ((x > y) ? x : y );}
    static int MIN(int x, int y){return ((x < y) ? x : y );}
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
			
			String lines = in.readLine();
			String[] strs = lines.trim().split("\\s+");
			int N = Integer.parseInt(strs[0]);
			int K = Integer.parseInt(strs[1]);
			int[] arr = new int[N];
			lines = in.readLine();
			strs = lines.trim().split("\\s+");
			int max = Integer.MIN_VALUE;
			for(int i = 0; i <N; i++)
			{
				arr[i] = Integer.parseInt(strs[i]);
				max = MAX(max, arr[i]);
			}
			int ret = 0;
			for(int i = K-1; i<N; i++)
			{
				if(arr[i] == max)
					ret+= N-i;
			}
			System.out.println(ret);
		}
	}
}