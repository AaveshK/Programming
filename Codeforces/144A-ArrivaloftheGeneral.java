/*

Sample Input 1

4
33 44 11 22

Sample Output 1

2

*/
import java.io.*;
import java.util.*;
  
public class ArrivaloftheGeneral
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
            int N = Integer.parseInt(in.readLine());
            String lines = in.readLine();
            String[] strs = lines.trim().split("\\s+");
            int min = Integer.MAX_VALUE;
            int mini = 0;
            int max = Integer.MIN_VALUE;
            int maxi = 0;
            for(int i = 0; i < strs.length; i++)
            {
                int temp = Integer.parseInt(strs[i]);
                if(temp>max)
                {
                    maxi=i;
                    max=temp;
                }
                if(temp<= min)
                {
                    mini=i;
                    min=temp;
                }
            }
            if(mini < maxi)
                System.out.println(maxi + (N-mini) - 2);
            else
                System.out.println(maxi + (N-mini) - 1);
        }
    }
}