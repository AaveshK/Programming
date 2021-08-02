import java.io.*;
import java.util.*;
public class HelpfulMaths_339A
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String  lines = in.readLine();
        String[] strs = lines.trim().split("[+]");
        int N = strs.length;
        int[] a = new int[N];
        for (int i = 0; i < N; i++)
        {
            a[i] = Integer.parseInt(strs[i]);
        }
        Arrays.sort(a);
        String op=""+a[0];
        for(int i=1;i<N;i++)
        {
            op=op+"+"+a[i];
        }
        System.out.println(op);
    } 
}
