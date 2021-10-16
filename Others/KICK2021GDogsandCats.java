/*

Sample Input 1

3
6 10 4 0
CCDCDD
4 1 2 0
CCCC
4 2 1 0
DCCD

Sample Output 1

Case #1: YES
Case #2: YES
Case #3: NO

*/
import java.io.*;
import java.util.*;
  
public class KICK2021GQ1
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
        for(int t = 1; t <= T; t++)
        {
            System.out.print("Case #"+t+": ");
            String lines = in.readLine();
            String[] strs = lines.trim().split("\\s+");
            int N = Integer.parseInt(strs[0]);
            int D = Integer.parseInt(strs[1]);
            long C = Integer.parseInt(strs[2]);
            int M = Integer.parseInt(strs[3]);
            char[] order = in.readLine().toCharArray();
            String flag = "YES";
            int d = 0;
            int c = 0;
            for(char ch : order)
                if(ch == 'D')
                    d++;
                else
                    c++;
            if(!(D > d && C > c))
            for(int i = 0; i < N; i++)
            {
                if(d == 0)
                {
                    flag = "YES";
                    break;
                }
                if(order[i] == 'D')
                {
                    if(D > 0)
                    {
                        D--;
                        d--;
                        C += M;
                    }
                    else
                    {
                        flag = "NO";
                        break;
                    }
                }
                else
                {
                    if(C > 0)
                    {
                        C--;
                        c--;
                    }
                    else
                    {
                        flag = "NO";
                        break;
                    }
                }
            }
            System.out.println(flag);
        }
    }
}