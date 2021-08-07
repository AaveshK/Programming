/*

Sample Input 1

4
10 5 5
10 6 5
10 4 5
10 8 5

Sample Output 1

2
4
9
8

*/

//import java.util.*;
//import java.lang.*;
import java.io.*;

import javax.lang.model.util.ElementScanner6;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		while(T -- > 0)
		{
            String  lines = in.readLine();    
            String[] strs = lines.trim().split("\\s+");
            long N = Long.parseLong(strs[0]);
            long p = Long.parseLong(strs[1]);
            long K = Long.parseLong(strs[2]);
            /*int N = Integer.parseInt(strs[0]);
            int p = Integer.parseInt(strs[1]);
            int K = Integer.parseInt(strs[2]);*/
            int count = 1;
            long i = 0;
            while(true)
            {
                /*if(p == 0)
                    {
                        System.out.println("1");
                        break;
                    }
                else if(p == K)
                    {System.out.println("2"); break;}*/
                if((i % (N+1)) != p)
                    {
                    count++;
                    i += K;
                    i = i % (N+1);
                    }
                else
                    {
                        System.out.println(count);
                        break;
                    }
                
                //System.out.print(i+" "+count+" ");
            }
            //System.out.println(count);
        }
	}
}