/*

Sample Input 1



Sample Output 1



*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Template
{
public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		while(T -- > 0)
		{
            String  lines = in.readLine();    
            String[] strs = lines.trim().split("\\s+");
            int[] A = new int[strs.length];
            for(int i = 0; i<3; i++)
            {
                A[i] = Integer.parseInt(strs[i]);
            }
        }
	}
}