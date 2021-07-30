import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	String  lines = in.readLine();
        String[] strs = lines.trim().split("\\s+");
        int m = Integer.parseInt(strs[0]);
        int n = Integer.parseInt(strs[1]);
        System.out.println(m*n/2);
    }
}