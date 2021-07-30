import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    String  lines = in.readLine();
	    String[] strs = lines.trim().split("\\s+");
	    int n = Integer.parseInt(strs[0]);
	    int m = Integer.parseInt(strs[1]);
	    int a = Integer.parseInt(strs[2]);
	    long count = 1;
	    if (n%a ==0)
	        count*=(n/a);
	    else
	        count*=(n/a+1);
	        
	    if (m%a ==0)
	        count*=(m/a);
	    else
	        count*=(m/a+1);
	    System.out.println(count);
    }
}