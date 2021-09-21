import java.util.*;
import java.io.*;
public class QueryParameter
{
	public static void main(String[] args) throws IOException
	{
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    String url = in.readLine();
	    int N = Integer.parseInt(in.readLine());
	    String[] param= new String[N];
	    for(int i = 0; i < N; i++)
	        param[i] = in.readLine();
	    for(int i = 0; i < N; i++)
	    {
	        int temp = url.indexOf(param[i]);
	        int temp2;
	        if(temp == -1)
	        {
	            System.out.println(temp);
	            continue;
	        }
	        else
	        {
	            temp2 = url.indexOf("&",temp);
	        }
	        if(temp2 == -1)
	            temp2 = url.length();
	        System.out.println(url.substring(temp+param[1].length()+3,temp2));
	    }
	}
}