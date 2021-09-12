/*

Sample Input 1

4
7
0101000
1101100
5
01100
10101
2
01
01
6
000000
111111

Sample Output 1

8
8
2
12

*/
import java.io.*;
import java.util.*;
  
class R1566C
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
        while( T -- > 0)
        {
            int N = Integer.parseInt(in.readLine());
            String lines = in.readLine();
            int[][] ar = new int[2][N];
            for(int i = 0; i < N; i++)
            {
                ar[0][i] = lines.charAt(i) - 48;
            }
            lines = in.readLine();
            for(int i = 0; i < N; i++)
            {
                ar[1][i] = lines.charAt(i) - 48;
            }
            int sum = 0;
            int temp = 0;
            int count = 0;
            for(int i = 0; i < N; i++)
            {
                if(ar[0][i] == ar[1][i] && ar[0][i] == 0)
                {
                    if(temp == 1)
                    {
                        sum+=2;
                        temp = 0;
                        // System.out.print("1");
                    }
                    else
                    {
                        count = 1;
                        sum++;
                        // System.out.print("2");
                    }
                }
                else if(ar[0][i] == ar[1][i] && ar[0][i] == 1)
                {
                    if(count == 1)
                    {
                        temp = 0;
                        count = 0;
                        sum++;
                        // System.out.print("3");
                    }
                    else
                    {
                        temp = 1;
                        // System.out.print("4");
                    }
                }
                else if(ar[0][i] != ar[1][i])
                {
                    sum+=2;
                    temp = 0;
                    count = 0;
                    // System.out.print("5");
                }
            }
            // System.out.println();
            System.out.println(sum);
        }
    }
}