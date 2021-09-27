/*

Sample Input 1

10 1
100 100

Sample Output 1

NO

*/
import java.io.*;
import java.util.*;
  
class Dragons
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
        int T = 1;
        while( T -- > 0)
        {
            String lines = in.readLine();
            String[] strs = lines.trim().split("\\s+");
            int s = Integer.parseInt(strs[0]);
            int n = Integer.parseInt(strs[1]);
            int[][] xy = new int[n][2];
            // int[] y = new int[n];
            for(int i = 0; i < n; i++)
            {
                lines = in.readLine();
                strs = lines.trim().split("\\s+");
                xy[i][0] = Integer.parseInt(strs[0]);
                xy[i][1] = Integer.parseInt(strs[1]);
            }
            sort2D(xy);
            int flag = 1;
            for(int i = 0; i < n; i++)
            {
                if(s > xy[i][0])
                    s += xy[i][1];
                else
                {
                    flag = 0;
                }
            }
            if(flag == 0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}