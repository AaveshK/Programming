import java.io.*;
import java.lang.Math;
public class BeautifulMatrix_263A
{
    public static void main(String args[]) throws IOException
    {    
        int[][] mat = new int[5][5];
        int min = Integer.MAX_VALUE;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));  
        for(int i=0;i<5;i++)
        {
            String  lines = in.readLine();
            String[] strs = lines.trim().split("\\s+");
            for(int j=0; j<5; j++)
            {
                mat[i][j] = Integer.parseInt(strs[j]);
                if(mat[i][j] == 1)
                {
                    int temp = Math.abs(2-i)+Math.abs(2-j);
                    if(temp < min)
                        min = temp;
                }
            }
        }
        System.out.println(min);
    }
}
