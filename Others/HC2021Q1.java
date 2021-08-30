/*

Sample Input 1

6
ABC
F
BANANA
FBHC
FOXEN
CONSISTENCY

Sample Output 1

Case #1: 2
Case #2: 0
Case #3: 3
Case #4: 4
Case #5: 5
Case #6: 12

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class HC2021Q1
{
    static int MAX(int x, int y){return ((x > y) ? x : y );}
    static int MIN(int x, int y){return ((x < y) ? x : y );}
    static int sum(int[] A){int sum = 0;for(int i=0; i<A.length; i++)sum+=A[i];return (sum);}
    static int gcd(int a, int b){if (b == 0)return a;return gcd(b, a % b);}
	static boolean isPowerOfTwo(int n){if(n==0)return false;return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==(int)(Math.floor(((Math.log(n) / Math.log(2)))));}
	static int countDigits(long l)
	{
			if (l >= 1000000000000000000L) return 19;
			if (l >= 100000000000000000L) return 18;
			if (l >= 10000000000000000L) return 17;
			if (l >= 1000000000000000L) return 16;
			if (l >= 100000000000000L) return 15;
			if (l >= 10000000000000L) return 14;
			if (l >= 1000000000000L) return 13;
			if (l >= 100000000000L) return 12;
			if (l >= 10000000000L) return 11;
			if (l >= 1000000000L) return 10;
			if (l >= 100000000L) return 9;
			if (l >= 10000000L) return 8;
			if (l >= 1000000L) return 7;
			if (l >= 100000L) return 6;
			if (l >= 10000L) return 5;
			if (l >= 1000L) return 4;
			if (l >= 100L) return 3;
			if (l >= 10L) return 2;
			return 1;
	}
	static void sort2D(int[][] Arr){Arrays.sort(Arr, (a, b) -> Double.compare(a[0], b[0]));}
	static boolean isVowel(char c)
	{
		if(c=='A'||c=='I'||c=='O'||c=='U'||c=='E')
		{
			return true;
		}
 		return false;
	}
    public static void main (String[] args) throws IOException
	{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(in.readLine());
		try {
			FileWriter fw = new FileWriter("E:/Github/Programming/Others/Output.txt");
			FileReader fr = new FileReader("E:/Github/Programming/Others/Input.txt");
			BufferedReader br=new BufferedReader(fr);
			for(int k = 1; k <= T; k++)
			{
				String s = br.readLine();
				int out = solver(s);
				System.out.println("Case #"+k+": "+out);
				fw.write("Case #"+k+": "+out+"\n");
				//fr.close();
				//fw.close();
			}
			fr.close();
			fw.close();
		}
		catch (IOException e) {
			System.out.println("There are some IOException");
		}
	}
	static int solver(String str)
	{
		int[] freq = new int[26];
		int c=0,v=0,ret = 0;
		int size = str.length();
		if(size == 1)
			{
				//System.out.println("0");
				return 0;
			}
		else
		{
			for(int i = 0; i < size-1; i++)
			{
				if(str.charAt(i) != str.charAt(i+1))
				{
					ret = 1;
					break;
				}
			}
			if(ret == 0)
				//System.out.println("0");
				return 0;
		}
		for(int i  =0; i < size; i++)
		{
			char ch = str.charAt(i);
			freq[ch - 65]++;
			if(isVowel(ch))
				v++;
			else
				c++;
		}
		if(v == 0 && c > 0)
		{
			//System.out.println(c);
			return c;
		}
		else if(v > 0 && c == 0)
		{
			//System.out.println(v);
			return v;
		}
		int temp = Integer.MAX_VALUE;
		for(int i = 0; i < 26; i++)
		{
			if(freq[i]>0)
			{
				int sum = 0;
				for(int j = 0;j < 26; j++)
				{
					char x = (char)(i+65);
					char y = (char)(j+65);
					if(i!=j&&freq[j]>0)
					{
						if(isVowel(x) && isVowel(y))
							sum+=(2*freq[j]);
						if(isVowel(x) && !isVowel(y))
							sum+=freq[j];
						if(!isVowel(x) && !isVowel(y))
							sum+=(2*freq[j]);
						if(!isVowel(x) && isVowel(y))
							sum+=freq[j];
					}
				}
				temp = MIN(temp,sum);
			}
		}
		return temp;
	}
}