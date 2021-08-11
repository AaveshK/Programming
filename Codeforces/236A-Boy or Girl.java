/*

Sample Input 1

wjmzbmr

Sample Output 1

CHAT WITH HER!

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class BoyorGirl
{
    static int max(int x, int y){return ((x > y) ? x : y );}
    static int min(int x, int y){return ((x < y) ? x : y );}
    static int sum(int[] A){int sum = 0;for(int i=0; i<A.length; i++)sum+=A[i];return (sum);}
    static int gcd(int a, int b){if (b == 0)return a;return gcd(b, a % b);}
    public static void main (String[] args) throws IOException
	{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String  s = in.readLine();    
        Map<Character, Integer> distinct = new HashMap<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (!distinct.containsKey(ch))
            {
                distinct.put(ch,1);
                count++;
            }
            else
                continue;
        }
        if(count % 2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
	}
}