/* package codechef; // don't place package name! */

//import java.util.*;
//import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class THREDICE
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    // your code goes here
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        double X,Y;
        //DecimalFormat df = new DecimalFormat("#.000000");
        while(T-->0)
        {
            String  lines = in.readLine();    
            String[] strs = lines.trim().split("\\s+");
            X = Double.parseDouble(strs[0]);
            Y = Double.parseDouble(strs[1]);
            Double prob =(6-(X+Y))/6;
            prob=(double)Math.round(prob * 1000000d) / 1000000d;
            if(X+Y<6)
                System.out.println(prob);
            else
                System.out.println("0");
        }
	}
}