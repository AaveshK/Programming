/*

Sample Input 1

6
1 2
3 5
5 3
6 6
8 0
0 0

Sample Output 1

-1
2
2
1
2
0

*/

import java.io.*;
import java.util.*;
import java.lang.*;
class variety
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader in =  new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        while( T -- > 0)
        {
            String lines = in.readLine();
            String strs[] = lines.trim().split("\\s+");
            int c = Integer.parseInt(strs[0]);
            int d = Integer.parseInt(strs[1]);
            if(c == 0 && d == 0)
                System.out.println("0");
            else if(c == d)
                System.out.println("1");
            else if(Math.abs(c-d)%2==0)
                System.out.println("2");
            else
                System.out.println("-1");
        }
    }
}