/*

Sample Input 1

2
3
111
6
100100

Sample Output 1

Case #1: 0
Case #2: 5

*/
import java.io.*;
import java.util.*;
  
class KickFA
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
            int N = Integer.parseInt(in.readLine());
            String lines = in.readLine();
            char ch[] = lines.toCharArray();
            int[] ar = new int[N];
            int temp = 0;
            for(int i = 0; i < N; i++)
            {
                if(ch[i] == '1')
                {
                    ar[i] = 0;
                    temp = 1;;
                }
                else
                {
                    if(temp > 0)
                        ar[i] = temp++;
                }
            }
            for(int i = N - 1; i >= 0; i--)
            {
                if(ch[i] == '1')
                {
                    temp = 1;;
                }
                else
                {
                    if(ar[i] > temp || (ar[i] == 0 && ch[i] != '1'))
                        ar[i] = temp++;
                }
            }
            long sum = 0;
            for(int i:ar)
            {
                // System.out.print(i+" ");
                sum+=i;
            }
            System.out.println("Case #"+k+": "+sum);
        }
    }
}