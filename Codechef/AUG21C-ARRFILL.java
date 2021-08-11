/*

Sample Input 1

3
10 1
5 2
8 2
5 2
6 3
3 2
2 2
1 3


Sample Output 1

25
41
5

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class ARRFILL
{
    static int max(int x, int y){return ((x > y) ? x : y );}
    static int min(int x, int y){return ((x < y) ? x : y );}
    static int sum(int[] A){int sum = 0;for(int i=0; i<A.length; i++)sum+=A[i];return (sum);}
    static long gcd(long a, long b){if (b == 0)return a;return gcd(b, a % b);}
    static class Pair
    {
        int x;
        int y;
        public Pair(int x, int y){this.x = x; this.y = y;}
        public int getX(){return this.x;}
        public int getY(){return this.y;}
    }
    public static void main (String[] args) throws IOException
	{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		while(T -- > 0)
		{
            String  lines = in.readLine();
            String[] strs = lines.trim().split("\\s+");
            long N = Long.parseLong(strs[0]);
            int M = Integer.parseInt(strs[1]);
            ArrayList<Pair> list = new ArrayList<>();
            
            for(int j = 0; j<M; j++)
            {
                lines = in.readLine();
                strs = lines.trim().split("\\s+");
                list.add(new Pair((int)Long.parseLong(strs[0]),(int)Long.parseLong(strs[1])));
            }
            sortList(list);

            long lcm=1, rem=N, ans=0;
            for(int j = (int)M-1; j > -1 && rem > 0; j--)
            {
                long a = (long) list.get(j).getX();
                long b = (long) list.get(j).getY();;
                //System.out.println(a + " "+b);
                lcm = lcm* b / gcd(lcm,b);
                ans = ans + (rem-N/lcm)*a;
                rem = N/lcm;
            }
            System.out.println(ans);
        }
	}
    static void sortList(ArrayList<Pair> list)
    {
        Collections.sort(list, new Comparator<Pair>()
        {
        @Override              
        public int compare(final Pair p1, final Pair p2)
        {
            
                return p1.x - p2.x;
        }
        });
    }
}