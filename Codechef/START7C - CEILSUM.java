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
		while(T-- > 0)
		{
		    String  lines = in.readLine();    
            String[] strs = lines.trim().split("\\s+");

            int A = Integer.parseInt(strs[0]);
            int B = Integer.parseInt(strs[1]);
            double sum=0.0;
            double tmp=0.0;
            if(A==B)
                sum=0;
            else if(A>B)
            {
                tmp=B+1;
                sum=Math.ceil((B-tmp)/2);
                sum+=Math.ceil((tmp-A)/2);
            }
            
            else if(B>A)
            {
                tmp=A+1;
                sum=Math.ceil((B-tmp)/2);
                sum+=Math.ceil((tmp-A)/2);
            }
            System.out.println((int)sum);
		}
	}
}