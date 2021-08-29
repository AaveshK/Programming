package DSA.SDESheet;

/*
Problem : https://www.geeksforgeeks.org/find-a-repeating-and-a-missing-number/

Repeating Element: 1

Missing number is: 5

*/

import java.io.*;
import java.util.*;
class RepeatingandMissing
{
    public static void main()
    {
        int[] arr = { 4, 3, 6, 2, 1, 1 };
        int N = arr.length;
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for(int i : arr)
        {
            if(!freq.containsKey(i))
                System.out.println("Repeating Element: "+i);
            else
                freq.put(i,1);
        }
        for(int i = 0; i <= N; i++)
        {
            if(freq.containsKey(i))
                continue;
            else
                System.out.println("Missing number is: "+i);
        }
    }
}
