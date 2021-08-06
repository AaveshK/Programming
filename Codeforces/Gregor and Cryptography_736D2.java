import java.io.IOException;
import java.io.*;
class GregorandCryptography
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        while ( T-- > 0)
        {
            int N=Integer.parseInt(in.readLine());
            System.out.println(2+" "+(N-1));
        }
    }
}