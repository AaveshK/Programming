import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		int op =0;
		while(T-- > 0)
		{
		    String  lines = in.readLine();    
            String[] strs = lines.trim().split("\\s+");
            int a = Integer.parseInt(strs[0]);
            int b = Integer.parseInt(strs[1]);
            
            if(a+b< 3)
                op =1;
            else if(a+b <= 10)
                op =2;
            else if(a+b <= 60)
                op =3;
            else
                op =4;
            System.out.println(op);
		}
	}
}