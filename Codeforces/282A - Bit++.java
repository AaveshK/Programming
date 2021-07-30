import java.io.*;
public class BitPlus
{
	public static void main(String[] args) throws IOException
	{
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(in.readLine());
	    int x = 0;
        while(n-- > 0)
        {
            String  inp = in.readLine();
            if(inp.charAt(1) == '+')
                x++;
            else
                x--;
        }
        System.out.println(x);
    }
}