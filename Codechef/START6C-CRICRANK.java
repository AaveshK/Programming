/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CRICRANK
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        int R,W,C,R2,W2,C2;
        while(T-->0)
        {
            int flag = 0, flag2 = 0;
            String  lines = in.readLine();    
            String[] strs = lines.trim().split("\\s+");
            R = Integer.parseInt(strs[0]);
            W = Integer.parseInt(strs[1]);
            C = Integer.parseInt(strs[2]);
            lines = in.readLine();    
            strs = lines.trim().split("\\s+");
            R2 = Integer.parseInt(strs[0]);
            W2 = Integer.parseInt(strs[1]);
            C2 = Integer.parseInt(strs[2]);
            
            if(R>R2)
                flag ++;
            else
                flag2 ++;
            if(W>W2)
                flag ++;
            else
                flag2 ++;
            if(C>C2)
                flag ++;
            else
                flag2 ++;
            if(flag2 > flag)
                System.out.println("B");
            else
                System.out.println("A");
        }
	}
}
