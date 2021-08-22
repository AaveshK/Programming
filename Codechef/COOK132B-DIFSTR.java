/*

Sample Input 1

2
3
101
110
100
4
1100
1010
0100
0010

Sample Output 1

111
1101

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class DIFSTR
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
    /*public static void main (String[] args) throws IOException
	{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		while( T -- > 0)
		{
			int N = Integer.parseInt(in.readLine());
			HashSet<Integer> uniq= new HashSet<Integer>();
			for(int i = 0; i < N; i++)
			{
				String lines = in.readLine();
				int decimal=Integer.parseInt(lines,2);
				uniq.add(decimal);
			}
			for(int i = (int) Math.pow(2,N-1);i < (int) Math.pow(2,N); i++)
			{
				if(uniq.contains(i))
					continue;
				else
					{System.out.println(Integer.toBinaryString(i));  break;}
			}
		}
	}*/
	public static void main (String[] args) throws IOException
	{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		while( T -- > 0)
		{
			int N = Integer.parseInt(in.readLine());
			ArrayList<String> ar = new ArrayList<String>();
			for(int i = 0; i < N; i++)
			{
				String lines = in.readLine();
				ar.add(lines);
			}
			String temp = "";
			for(int i = 0; i < N; i++)
			{
				if(ar.get(i).charAt(i) == '0')
					temp = temp + '1';
				else
					temp = temp + "0";
			}
			System.out.println(temp);
		}
	}
}