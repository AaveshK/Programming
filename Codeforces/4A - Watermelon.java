import java.io.*;
public class Watermelon
{
	public static void main(String[] args) throws IOException
	{
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    int w = Integer.parseInt(in.readLine());
	    if(w%2 == 0 && w > 2)
		    System.out.println("YES");
		else
		    System.out.println("NO");
	}
}