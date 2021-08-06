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
            int count = 0;
            int i =0;
            int j =0;
            while(i != p)
            {
                if(i == p)
                {//count++;
                    break;}
                if(i > N)
                    {j++; i=j;}
                i += K;
                count++;
                System.out.print(count+" ");
            }
            System.out.println(count);
        }
	}
}