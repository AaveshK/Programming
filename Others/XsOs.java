/*

Sample Input 1

8
2
XO
..
2
X.
.O
3
...
...
...
3
.OX
X..
..O
3
OXO
X.X
OXO
3
.XO
O.X
XO.
4
X...
.O.O
.XX.
O.XO
5
OX.OO
X.XXX
OXOOO
OXOOO
XXXX.

Sample Output 1

Case #1: 2 1
Case #2: 1 2
Case #3: 3 6
Case #4: 2 2
Case #5: 1 1
Case #6: Impossible
Case #7: 3 1
Case #8: 1 2

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class XsOs
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
		for(int i = 1; i <= T; i++)
		{
			int N = Integer.parseInt(in.readLine());
			char[][] arr = new char[N][N];
			for(int j = 0; j < N; j++)
			{
				String lines = in.readLine();
				arr[j] = lines.toCharArray();
			}
			// for(int j = 0; j < N; j++)
			// {
			// 	for(int k = 0; k < N; k++)
			// 	{
			// 		System.out.print(arr[j][k]+" ");
			// 	}
			// 	System.out.println();
			// }
			System.out.print("Case #"+i+": ");
			solver(arr);
		}
	}
	static void solver(char[][] comb)
	{
		TreeMap<Integer, Integer> map = new TreeMap<Integer,Integer>();
		for(int i = 0; i < comb.length; i++)
		{
			int r = 0, re = 0;
			for(int j = 0; j < comb.length; j++)
			{
				if(comb[i][j] == 'O')
				{
					r = 0;
					re = 0;
					break;
				}
				else
				{
					if(comb[i][j] == '.')
					{
						r++;
					}
					re++;
				}
			}
			if(r == 0)
				continue;
			if(!map.containsKey(r))
				map.put(r,1);
			else
				map.put(r,map.get(r)+1);
			//map.put(r,map.getOrDefault(r, 0)+1);
		}
		for(int i = 0; i < comb.length; i++)
		{
			int r = 0, re = 0;
			for(int j = 0; j < comb.length; j++)
			{
				if(comb[j][i] == 'O')
				{
					r = 0;
					re = 0;
					break;
				}
				else
				{
					if(comb[j][i] == '.')
					{
						r++;
					}
					re++;
				}
			}
			if(r == 0)
			{
				continue;
			}
			if(!map.containsKey(r))
				map.put(r,1);
			else
				map.put(r,map.get(r)+1);
			//map.put(r,map.getOrDefault(r, 0)+1);
		}
		for(int i  =0 ;i < comb.length; i++)
		{
			for(int j = 0; j < comb.length; j++)
			{
				if(comb[i][j] == '.')
				{
					int r1 = 0, r2 = 0;
					for(int k = 0; k < comb.length; k++)
					{
						if(comb[i][k] == 'O' || comb[k][j] == 'O')
						{
							r1 = 0;
							r2 = 0;
							break;
						}
						if(comb[i][k] == '.')
						{
							r1++;
						}
						if(comb[k][j] == '.')
						{
							r2++;
						}
					}
					if(r1 == 1 && r2 == 1)
					{
						if(!map.containsKey(r1))
							map.put(r1,-1);
						else
							map.put(r1,map.get(r1)-1);
						//map.put(r1,map.getOrDefault(r1, 0)-1);
					}
				}
			}
		}
		if(map.size() == 0)
		{
			System.out.println("Impossible");
		}
		Set<Integer> keys = map.keySet();
		int c = 0;
		for (Integer key : keys)
		{
			c++;
            System.out.print(key + " " + map.get(key));
			if(c == 1)
				{System.out.println();break;}
        }
	}
}