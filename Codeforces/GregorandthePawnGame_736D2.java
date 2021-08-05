/*

Sample Input:       Sample Output:
4
3
000
111                 3
4
1111
1111                4
3
010
010                 0
5
11001
00000               0

*/
import java.io.IOException;
import java.io.*;
class codef
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        while(T -- > 0)
        {
            int count = 0;
            int N = Integer.parseInt(in.readLine());
            String  lines = in.readLine();
            int[] e = new int[N];
            for (int i = 0; i < N; i++)
            {
                e[i] = Integer.parseInt(String.valueOf(lines.charAt(i)));
            }
            lines = in.readLine();
            int[] o = new int[N];
            for (int i = 0; i < N; i++)
            {
                o[i] = Integer.parseInt(String.valueOf(lines.charAt(i)));
                if(o[i] == 1)
                {
                    if(e[i] == 0)
                        {
                            count++;
                            o[i] = 0;
                        }
                }
            }
            
            for(int i=0; i<N; i++)
            {
                if(o[i]==1)
                    if(e[i] == 0)
                    {
                        e[i] = -1;
                        count++;
                    }
                    else if(i>0 && e[i-1] == 1)
                    {
                        count++;
                        e[i-1] = -1;
                    }
                    else if(i<N-1 && e[i+1] == 1)
                    {
                        e[i+1] = -1;
                        count++;
                    }
            }
            System.out.println(count);
        }
    }
}