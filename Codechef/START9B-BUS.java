/*

Sample Input 1

2
2 1 4
+ 1
+ 2
- 1
- 2
3 2 6
+ 2
+ 1
- 1
+ 3
- 3
- 2

Sample Output 1

Inconsistent
Consistent

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class BUS
{
    static int max(int x, int y){return ((x > y) ? x : y );}
    static int min(int x, int y){return ((x < y) ? x : y );}
    static int sum(int[] A){int sum = 0;for(int i=0; i<A.length; i++)sum+=A[i];return (sum);}
    static int gcd(int a, int b){if (b == 0)return a;return gcd(b, a % b);}
    public static void main (String[] args) throws IOException
	{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		while(T -- > 0)
		{
            String  lines = in.readLine();    
            String[] strs = lines.trim().split("\\s+");
            int N = Integer.parseInt(strs[0]);
            int M = Integer.parseInt(strs[1]);
            int Q = Integer.parseInt(strs[2]);
            int flag = 0;
            HashSet<Integer> set = new HashSet<Integer>();
            for(int i = 0; i<Q; i++)
            {
                lines = in.readLine();    
                strs = lines.trim().split("\\s+");
                char ch = strs[0].charAt(0);
                int x = Integer.parseInt(strs[1]);
                //System.out.println("Debug "+x+" "+ch+" "+set.size());
                if(ch == '+')
                {
                    if(set.size()>=M || set.contains(x))
                        {//System.out.println("Inconsistent");
                        flag=1;}
                    else
                        set.add(x);
                }
                else
                    if(!set.contains(x))
                        flag=1;
                else
                    set.remove(x);
            }
            if(flag == 1)
                System.out.println("Inconsistent");
            else
                System.out.println("Consistent");
        }
	}
}