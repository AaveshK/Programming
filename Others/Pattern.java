/*

Sample Input 1

A5B7C2D3E4F6G10A2

Sample Output 1

A B C D E F G A
A B C D E F G A
A B   D E F G
A B     E F G 
A B       F G
  B       F G
  B         G
            G
            G
            G

*/


import java.io.*;

class Pattern
{
	public static void main(String[] args) throws IOException
	{
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    String lines = in.readLine();
	    int N = lines.length();
	    int[] ar = new int[N/2+1];
	    char[] arr = new char[N/2+1];        
	    int max = -1;
        int j =0;
	    for(int i=0; i<N-1; i++)
	    {
	        char ch = lines.charAt(i);
			if(!Character.isDigit(ch))
			{
				arr[j++] = ch;
				lines = lines.substring(0,i)+" "+lines.substring(i+1);
			}
	    }
		String[] strs = lines.trim().split("\\s+");
		N = strs.length;
        for(int i = 0; i<N; i++)
        {
            ar[i] = Integer.parseInt(strs[i]);
			if(ar[i]>max)
				max = ar[i];
        }
        System.out.println();
	    for(int i=0; i< max; i++)
	    {
	        for(j =0; j<ar.length;j++)
	        {
	            if(ar[j]>0)
	                System.out.print(arr[j]+" ");
                else
                System.out.print("  ");
	            ar[j]--;
	        }
	        System.out.println();
	    }
	}
}