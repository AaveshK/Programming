package DSA.SDESheet;

/*

Sample Input 1



Sample Output 1



*/

import java.util.*;
import java.lang.*;
import java.io.*;

class SetMatrixZeroes
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
			String lines = in.readLine();
			String[] strs = lines.trim().split("\\s+");
			int[] arr = new int[N];
			for(int i = 0; i < N; i++)
			{
				arr[i] = Integer.parseInt(strs[i]);
				System.out.println(arr[i]+" ");
			}
		}
	}
	public void setZeroesON(int[][] matrix)
    {
        int M = matrix.length;
        int[] row = new int[M];
        int N = matrix[0].length;
        int[] col = new int[N];
        for(int i = 0; i < M; i++)
        {
            for(int j = 0; j < N; j++)
            {
                if(matrix[i][j] == 0)
                {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i = 0; i < M; i++)
        {
            for(int j = 0; j < N; j++)
            {
                if(row[i] == 1 || col[j] == 1)
                    matrix[i][j] = 0;
            }
        }
    }
	public void setZeroesO1(int[][] matrix)
    {
        int M = matrix.length;
        int N = matrix[0].length;
        int temp = 1;
        for(int i = 0; i < M; i++)
        {
            if(matrix[i][0] == 0)
                temp = 0;
            for(int j = 1; j < N; j++)
            {
                if(matrix[i][j] == 0)
                {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for(int i = M-1; i >= 0; i--)
        {
            for(int j = N -1; j >= 1; j--)
            {
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
            if(temp == 0)
                matrix[i][0] = 0;
        }
    }
}