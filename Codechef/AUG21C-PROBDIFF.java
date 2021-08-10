/*

Sample Input 1

3
1 4 3 2
4 5 5 5
2 2 2 2

Sample Output 1

2
1
0

*/

import java.io.*;
import java.util.*;

class PROBDIFF
{
	public static void main (String[] args) throws IOException
	{
		// your code goes here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		while(T -- > 0)
		{
            String  lines = in.readLine();    
            String[] strs = lines.trim().split("\\s+");
            int[] A = new int[4];
            HashSet <Integer> dist = new HashSet<>();
            for(int i = 0; i<4; i++)
            {
                A[i] = Integer.parseInt(strs[i]);
                dist.add(A[i]);
            }
            int ret = 0;
            if(dist.size() == 4 || dist.size() == 3)
                ret = 2;
            else if (dist.size() == 2)
            {
                int x = A[0];
                int count = 0;
                for(int i=0; i<4;i++)
                    if(A[i] == x)
                        count++;
                if(count == 2)
                    ret = 2;
                else
                    ret = 1;
            }
            else
                ret = 0;
            System.out.println(ret);
        }
    }
}