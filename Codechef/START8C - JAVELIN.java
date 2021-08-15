/*

Sample Input 1

3
3 8000 2
5000 5001 5002
3 5000 2
7999 7998 8000
4 6000 3
5999 5998 6000 6001

Sample Output 1

2 2 3
3 1 2 3
3 1 3 4

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class JAVELIN
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
            String  lines = in.readLine();    
            String[] strs = lines.trim().split("\\s+");
            int N = Integer.parseInt(strs[0]);
            int M = Integer.parseInt(strs[1]);
            int X = Integer.parseInt(strs[2]);

            int[] A = new int[N+1];
            //ArrayList<Integer> qualified=new ArrayList<Integer>();
            lines = in.readLine();    
            strs = lines.trim().split("\\s+");
            int qual = 0;
            for(int i = 1; i <= N; i++)
            {
                A[i] = Integer.parseInt(strs[i-1]);
                if(A[i] >= M)
                    {
                        qual++;
                        //A[i] = -1;
                    }
            }
            if(qual >= X)
            {
                System.out.print(qual);
                for(int i = 1; i<= qual; i++)
                {
                    System.out.print(" "+(i));
                }
                System.out.println();
            }
            else
            {
                if(qual>0)
                {
                     for(int i=1;i<=N;i++)
                     {
                           if(A[i]>=M)
                           {
                                A[i]=-1;
                           }
                      }
                }
                int x = X-qual;
                while(x-- > 0)
                {
                    int maxn = 0;
                    int maxi = 0;
                    for(int i =1; i<=N; i++)
                    {
                        if(A[i] > maxn)
                        {
                            maxn = A[i];
                            maxi = i;
                        }
                    }
                    A[maxi] = -1;
                }
                System.out.print(X);
                for(int i = 1; i<= N; i++)
                {
                    if(A[i] == -1)
                        System.out.print(" "+i);
                }
                System.out.println();
            }
        }
	}
}