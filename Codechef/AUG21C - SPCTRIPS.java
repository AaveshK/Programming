/*

Sample Input 1
3
3
4
5


Sample Output 1
3
6
9


*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef2
{
public static void main (String[] args) throws IOException
	{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		while(T -- > 0)
		{
            int N = Integer.parseInt(in.readLine());
            int count=0;
            for(int c = 1; c <= N; c++)
                for(int b = c; b <= N; b=b+c)
                    if(b % c == 0)
                        for(int a = c; a <= N; a=a+b)
                            if( a % b == c)
                            {
                                count++;
                                //System.out.print("("+a+","+b+","+c+")"+" ");
                            }
            System.out.println(count);
        }
	}
}