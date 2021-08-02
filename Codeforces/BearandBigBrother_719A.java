import java.io.*;
public class BearandBigBrother_719A
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String lines = in.readLine();
        String[] strs = lines.trim().split("\\s+");
        int a = Integer.parseInt(strs[0]);
        int b = Integer.parseInt(strs[1]);
        int count = 0;
        while(b>= a)
        {
            count++;
            b = b*2;
            a = a*3;
        }
        System.out.println(count);
    }
}