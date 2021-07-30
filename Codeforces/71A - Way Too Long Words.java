import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(in.readLine());
	    while(n-- > 0)
	    {
	        String s = in.readLine();
	        int len = s.length();
	        if(len>10)
	            System.out.println(s.charAt(0)+""+(len-2)+""+s.charAt(len-1));
	        else
	            System.out.println(s);
	    }
	}
}