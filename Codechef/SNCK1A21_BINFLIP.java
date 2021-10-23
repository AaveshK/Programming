/*

Sample Input 1

3
5 0
3 3
2 2

Sample Output 1

YES
0
YES
2
3
1
NO

*/

// Passing sample TCs and seems logically correct to me.
// Maybe I'm missing one fo the corner cases.
import java.io.*;
import java.util.*;
  
public class SNCK1A21_BINFLIP
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
            String[] strs = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(strs[0]);
            int K = Integer.parseInt(strs[1]);
            if(K == 0)
            {
                System.out.println("YES"+"\n0");
                continue;
            }
            if(K % 2 == 0)
            {
                System.out.println("NO");
                continue;
            }
            int start = 1;
            int power = 0;
            System.out.println("YES\n"+(int)(Math.log(K+1) / Math.log(2)));
            while(start <= K)
            {
                System.out.println(start);
                start += Math.pow(2,power);
                power++;
                if(start == K)
                    break;
            }
        }
    }
}