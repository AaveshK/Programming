import java.io.*;
public class PetyaandStrings_112A
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str1 = in.readLine();
        String str2 = in.readLine();
        int op = 0;
        if(str1.compareToIgnoreCase(str2)>0)
            op = 1;
        else if(str1.compareToIgnoreCase(str2)<0)
            op = -1;
        System.out.println(op);
    }
}