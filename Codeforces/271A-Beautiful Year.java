/*
 
Sample Input 1
 
1987
 
Sample Output 1
 
2013
 
*/
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
class BeautifulYear
{
    static int max(int x, int y){return ((x > y) ? x : y );}
    static int min(int x, int y){return ((x < y) ? x : y );}
    static int sum(int[] A){int sum = 0;for(int i=0; i<A.length; i++)sum+=A[i];return (sum);}
    static int gcd(int a, int b){if (b == 0)return a;return gcd(b, a % b);}
    public static void main (String[] args) throws IOException
	{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int y = Integer.parseInt(in.readLine());
		while(y <= 9000)
        {
            y++;
 
            int year = y % 10;
            int dec = (y / 10) % 10;
            int cent = (y / 100) % 10;
            int mil = y /1000;
 
            if(year != dec && year != cent && year != mil && dec != cent && dec != mil && cent != mil)
                break;
        }
        System.out.println(y);
	}
}