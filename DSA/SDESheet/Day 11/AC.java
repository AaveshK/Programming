import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
        while( T -- > 0)
        {
        	String lines = in.readLine();
        	String[] strs = lines.trim().split("\\s+");
        	int n = Integer.parseInt(strs[0]);
        	int c = Integer.parseInt(strs[1]);
        	int[] coord = new int[n];
        	for(int i = 0; i < n; i++)
        		coord[i] = Integer.parseInt(in.readLine());
        	Arrays.sort(coord);
        	int low = 1;
        	int high = coord[n-1] - coord[0];
        	int ret = 0;
        	while(low <= high)
        	{
        		int mid = low + (high - low+1)/2;
        		if(canPlace(coord, c, mid))
        		{
        			ret = mid;
        			low = mid+1;
        // 			break;
        		}
        		else
        		{
        			high = mid - 1;
        		}
        	}
        	System.out.println(ret);
        }

	}
	static boolean canPlace(int[] coord, int cows, int dist)
	{
		int count = 1;
		int lastPlaced = coord[0];
		for(int i = 1; i < coord.length; i++)
		{
			if(coord[i] - lastPlaced >= dist)
			{
				count++;
				lastPlaced = coord[i];
			}
			if(count == cows)
				return true;
		}
		return false;
	}
}