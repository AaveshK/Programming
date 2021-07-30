import java.io.*;
public class Team
{
	public static void main(String[] args) throws IOException
	{
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(in.readLine());
	    int count = 0;
	    while(n-- > 0)
	    {
    	    String  lines = in.readLine();
    	    String[] strs = lines.trim().split("\\s+");
    	    int p = Integer.parseInt(strs[0]);
    	    int v = Integer.parseInt(strs[1]);
    	    int t = Integer.parseInt(strs[2]);
    	    if ((p+v+t) >= 2)
    	        count ++;
	    }
	    System.out.println(count);
    }
}