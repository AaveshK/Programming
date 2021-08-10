/*

Sample Input 0 ( Sub-Task 1)

4
5
31 32 6 13 7
50 50 50 50 50
5
43 26 22 11 30
49 49 49 49 49
5
36 40 49 19 37
48 48 48 48 48
5
16 3 24 21 21
50 50 50 50 50


Sample Output 0

3
3 0 6
5 6 13
4 13 26
2
4 0 11
3 11 33
1
4 0 19
3
2 0 3
1 3 19
5 19 40



Sample Input 1 (Sub-Task 2)
4
5
31 32 6 13 7
14 50 34 4 31
5
43 26 22 11 30
26 4 41 46 49
5
36 40 49 19 37
18 11 48 15 33
5
16 3 24 21 21
24 31 36 49 50


Sample Output 1
3
3 0 6
5 6 13
2 13 45
2
4 0 11
3 11 33
0
3
2 0 3
1 3 19
4 19 40



*/

import java.util.*;
import java.lang.*;
import java.io.*;

class CHARGE
{
    static int max(int x, int y){return ((x > y) ? x : y );}
    static int min(int x, int y){return ((x < y) ? x : y );}
    static int sum(int[] A){int sum = 0;for(int i=0; i<A.length; i++)sum+=A[i];return (sum);}
    static long gcd(long a, long b){if (b == 0)return a;return gcd(b, a % b);}
    public static void main (String[] args) throws IOException
	{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int Q = Integer.parseInt(in.readLine());
		while(Q -- > 0)
		{
            int N = Integer.parseInt(in.readLine());
            String  lines = in.readLine();    
            String[] strs = lines.trim().split("\\s+");
            //int[] A = new int[N];
            int[] T = new int[N];
            int[][] arr = new int[N][2];
            for(int i = 0; i<N; i++)
            {
                arr[i][0] = i;
                arr[i][1] = Integer.parseInt(strs[i]);
                //A[i] = Integer.parseInt(strs[i]);
            }
            //int[] T = new int[N];
            lines = in.readLine();
            strs = lines.trim().split("\\s+");
            for(int i = 0; i<N; i++)
            {
                //arr[i][2] = Integer.parseInt(strs[i]);
                T[i] = Integer.parseInt(strs[i]);
            }
            //Arrays.sort(A);
            sortbyColumn(arr, 1);
            int count = 0;
            int i = 0;
            int j = 0;
            while(i <=  T[0])
            {
                if(i+arr[j][1]<= T[0])
                    {i+=arr[j++][1];count++;}
                else
                    break;
            }
            System.out.println(count);
            int time=0;
            for(int k = 0; k< count; k++)
            {
                System.out.print(arr[k][0]+1+" "+time+" ");
                time+=arr[k][1];
                System.out.print(time);
                System.out.println();
            }
        }
    }
            /*for (int i = 0; i < arr.length; i++)
            {
                for (int j = 0; j < arr[i].length; j++)
                    System.out.print(arr[i][j] + " ");
                System.out.println();
            }
            int time = 0;
            while(time<)
        }
    }*/
    public static void sortbyColumn(int arr[][], int col)
    {
        Arrays.sort(arr, new Comparator<int[]>()
        {
          @Override              
          public int compare(final int[] entry1, final int[] entry2)
            {
  
            if (entry1[col] > entry2[col])
                return 1;
            else
                return -1;
            }
        });
    }
}