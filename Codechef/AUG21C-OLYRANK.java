/*

Sample Input 1

3
10 20 30 0 29 30
0 0 0 0 0 1
1 1 1 0 0 0

Sample Output 1

1
2
1

*/


import java.io.*;
class OLYRANK
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
            int G1 = Integer.parseInt(strs[0]);
            int S1 = Integer.parseInt(strs[1]);
            int B1 = Integer.parseInt(strs[2]);
            int G2 = Integer.parseInt(strs[3]);
            int S2 = Integer.parseInt(strs[4]);
            int B2 = Integer.parseInt(strs[5]);
            if((G1+S1+B1) > (G2+S2+B2))
                System.out.println("1");
            else
                System.out.println("2");
        }
	}
}
