import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	String  lines = in.readLine();
        String[] strs = lines.trim().split("\\s+");
        int n = Integer.parseInt(strs[0]);
        int k = Integer.parseInt(strs[1]);
        int[] sc = new int[n];
        int count = 0;
        lines = in.readLine();
        strs = lines.trim().split("\\s+");
        for(int j = 0; j< strs.length; j++)
        {
                sc[j] = Integer.parseInt(strs[j]);
        }
        int comp = sc[k-1];
        for(int i=0; i<n;i++)
        {
            if(sc[i] >= comp && sc[i] >0)
                count++;
        }
        if(count == 0)
            System.out.println("0");
        else
            System.out.println(count);
    }
}