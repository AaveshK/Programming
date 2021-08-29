package DSA.SDESheet;
/*

Sample Input 1



Sample Output 1



*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Merge2SortedArray
{
    public static void main (String[] args) throws IOException
	{
		long start = System.nanoTime();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int[] ar1 = {1,2,3,7,8,9};
        int[] ar2 = {4,5,6,10};
		optimal obj1 = new optimal();
		brute obj2 = new brute();
		better obj3 = new better();
		obj2.Brute(ar1.clone(),ar2.clone());
		obj3.Better(ar1.clone(),ar2.clone());
		obj1.Optimal(ar1.clone(),ar2.clone());
		//Better(ar1,ar2);
		//Optimal(ar1,ar2);
		long end = System.nanoTime();
		double elapsedTime = end - start;
		elapsedTime = elapsedTime/1000000;
        System.out.println("Elapsed time : "+ elapsedTime+" ms");
	}
}
class optimal
{
	void Optimal(int[] ar1, int[] ar2)
	{
		// Gap method
		long start = System.nanoTime();

		int gap = ar1.length + ar2.length;
		gap=(int)Math.ceil(gap/2);
		// int p1=0; int p2 = gap;
		for(int i : ar1)
        {
            System.out.print(i+" ");
        }
		for(int i : ar2)
        {
            System.out.print(i+" ");
        }
		System.out.println();
		while(gap>=1)
		{
			int i;
			for(i =0; i + gap < ar1.length; i++)
			{
				if(ar1[i] > ar1[i+gap])
				{
					int temp = ar1[i];
					ar1[i] = ar1[i+gap];
					ar1[i+gap] = temp;
				}
			}
			for(int j = gap > ar1.length ? gap - ar1.length : 0;i < ar1.length && j < ar2.length; i++, j++)
			{
				if(ar1[i] > ar2[j])
				{
					int temp = ar1[i];
					ar1[i] = ar2[j];
					ar2[j] = temp;
				}
			}
			for(int j = 0; j + gap < ar2.length; j++)
			{
				if(ar2[j] > ar2[j+gap])
				{
					int temp = ar2[j];
					ar2[j] = ar2[j+gap];
					ar2[j+gap] = temp;
				}
			}
			if(gap == 1)
				gap = 0;
			else
				gap=(int)Math.ceil(gap/2);
		}
		for(int i : ar1)
        {
            System.out.print(i+" ");
        }
		for(int i : ar2)
        {
            System.out.print(i+" ");
        }
		long end = System.nanoTime();
		double elapsedTime = end - start;
		elapsedTime = elapsedTime/1000000;
        System.out.println("Elapsed time : (Optimal) "+ elapsedTime+" ms");
	}
}
class better
{
	void Better(int[] ar1, int[] ar2)
	{
		long start = System.nanoTime();
		for(int i : ar1)
        {
            System.out.print(i+" ");
        }
		for(int i : ar2)
        {
            System.out.print(i+" ");
        }
		System.out.println();
		for(int i = 0; i < ar1.length; i++)
		{
			if(ar1[i] > ar2[0])
			{
				int temp = ar1[i];
				ar1[i] = ar2[0];
				ar2[0] = temp;
				for(int j = 0; j < ar2.length-1; j++)
				{
					if(ar2[j] < ar2[j+1])
						continue;
					else
						{
							temp = ar2[j];
							ar2[j] = ar2[j+1];
							ar2[j+1] = temp;
						}
				}
			}
		}
		for(int i : ar1)
        {
            System.out.print(i+" ");
        }
		for(int i : ar2)
        {
            System.out.print(i+" ");
        }
		long end = System.nanoTime();
		double elapsedTime = end - start;
		elapsedTime = elapsedTime/1000000;
        System.out.println("Elapsed time : (Better) "+ elapsedTime+" ms");
	}
}
class brute
{
	void Brute(int[] ar1, int[] ar2)
	{
		long start = System.nanoTime();
		for(int i : ar1)
        {
            System.out.print(i+" ");
        }
		for(int i : ar2)
        {
            System.out.print(i+" ");
        }
		System.out.println();
		int[] temp = new int[ar1.length+ar2.length];
        int ind = 0;
        for(int i : ar1)
        {
            temp[ind++] = i;
        }
        for(int i : ar2)
        {
            temp[ind++] = i;
        }
		Arrays.sort(temp);
		ind = 0;
		while(ind < ar1.length)
		{
			ar1[ind] = temp[ind++];
		}
		while(ind-ar1.length < ar2.length)
		{
			ar2[ind-ar1.length] = temp[ind++];
		}
        for(int i : temp)
        {
            System.out.print(i+" ");
        }
		long end = System.nanoTime();
		double elapsedTime = end - start;
		elapsedTime = elapsedTime/1000000;
        System.out.println("Elapsed time : (Brute) "+ elapsedTime+" ms");
	}
}