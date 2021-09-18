/*

Sample Input 1

2
10 4 2
800 2 8
1500 6 9
200 4 7
400 3 5
5 3 3
400 1 3
500 5 5
300 2 3

Sample Output 1

Case #1: 2300
Case #2: 700

*/


// --------- Passes the same TC but RE for actual submission ---------

import java.io.*;
import java.util.*;
  
class Festival
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
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        if (System.getProperty("ONLINE_JUDGE") == null)
        {
            try 
            {
                in = new BufferedReader(new FileReader("input.txt"));
                System.setOut(new PrintStream(new FileOutputStream("output.txt")));
            }
            catch (Exception e) {
                //System.out.println("Exception");
            }
        }
        int T = Integer.parseInt(in.readLine());
        for(int k = 1; k <= T; k++)
        {
            String lines = in.readLine();
            String[] strs = lines.trim().split("\\s+");
            int D = Integer.parseInt(strs[0]);
            int N = Integer.parseInt(strs[1]);
            int K = Integer.parseInt(strs[2]);
            int[][] H = new int[N][3];
            // ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
            for(int i = 0; i < N; i++)
            {
                lines = in.readLine();
                strs = lines.trim().split("\\s+");
                H[i][0] = Integer.parseInt(strs[0]);
                H[i][1] = Integer.parseInt(strs[1]);
                H[i][2] = Integer.parseInt(strs[2]);
            }
            // for(int i = 0; i < N; i++)
            // {
            //     for(int j = 0; j < 3; j++)
            //         System.out.print(H[i][j]+" ");
            //     System.out.println();
            // }
            // System.out.println("----------");
            int[][] ret = new int[D+1][2];
            sort2D(H);
            // for(int i = 0; i < N; i++)
            // {
            //     for(int j = 0; j < 3; j++)
            //         System.out.print(H[i][j]+" ");
            //     System.out.println();
            // }
            for(int i = 0; i < N; i++)
            {
                for(int j = H[i][1]; j <= H[i][2]; j++)
                {
                    if(ret[j][0] == K)
                        continue;
                    ret[j][0]++;
                    ret[j][1] += H[i][0];
                }
            }
            sortbyColumn(ret,1);
            // for(int i = 0; i < D; i++)
            // {
            //     for(int j = 0; j < 2; j++)
            //         System.out.print(ret[i][j]+" ");
            //     System.out.println();
            // }
            System.out.println("Case #"+k+": "+ret[0][1]);
        }
    }
    static void sortbyColumn(int arr[][], int col)
    {
        Arrays.sort(arr, new Comparator<int[]>() {
            
          @Override              
          public int compare(final int[] entry1, 
                             final int[] entry2) {
            if (entry1[col] < entry2[col])
                return 1;
            else
                return -1;
          }
        });
    }
}