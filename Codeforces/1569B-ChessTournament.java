/*

Sample Input 1

3
3
111
2
21
4
2122

Sample Output 1

YES
X==
=X=
==X
NO
YES
X=+-
=X==
-=X+
+=-X

*/
import java.io.*;
import java.util.*;
  
class R1569B
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
            String s = in.readLine();
            char[] ch = s.toCharArray();
            char[][] res = new char[N][N];
            for (char[] row: res)
                Arrays.fill(row, '!');
  
            int count2 = 0;
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < N; i++)
            {
                if(ch[i] == '2')
                    {count2++; list.add(i);}
            }
            if(count2 <= 2 && count2>0)
                System.out.println("NO");
            else
            {
                System.out.println("YES");
                for(int i = 0; i < N; i++)
                {
                    if(ch[i] == '1')
                    {
                        for(int j = 0; j < N; j++)
                        {
                            res[i][j] = '=';
                            res[j][i] = '=';
                        }
                    }
                }
                for(int i = 0; i < list.size(); i++)
                {
                    for(int j = 0; j <list.size(); j++)
                    {
                        if(i == j)
                            continue;
                        if(res[list.get(i)][list.get(j)] == '!')
                        {
                            res[list.get(i)][list.get(j)] = '=';
                            // res[list.get(j)][list.get(i)] = '=';
                        }
                    }
                    if(i == list.size() - 1)
                    {
                        res[list.get(i)][list.get(0)] = '+';
                        res[list.get(0)][list.get(i)] = '-';
                    }
                    else
                    {
                        res[list.get(i)][list.get(i+1)] = '+';
                        res[list.get(i+1)][list.get(i)] = '-';
                    }
                }
                for(int i = 0; i < N; i++)
                {
                    res[i][i] = 'X';
                    for(int j = 0; j < N; j++)
                        System.out.print(res[i][j]);
                    System.out.println();
                }
            }
        }
    }
}