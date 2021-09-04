package DSA.SDESheet;

/*

Sample Input 1



Sample Output 1



*/

import java.util.*;
import java.lang.*;
import java.io.*;

class FindDuplicate
{
    static int max(int x, int y){return ((x > y) ? x : y );}
    static int min(int x, int y){return ((x < y) ? x : y );}
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
    public static void main (String[] args) throws IOException
	{
		long start = System.nanoTime();
		int[] arr = {1,3,4,2,2};
		System.out.println(findDuplicateExtraAr(arr));
		long end = System.nanoTime();
		double elapsedTime = end - start;
		elapsedTime = elapsedTime/1000000;
		System.out.println("Elapsed time : "+ elapsedTime+" ms");
		start = System.nanoTime();
		System.out.println(findDuplicateTwoPointer(arr));
		end = System.nanoTime();
		elapsedTime = end - start;
		elapsedTime = elapsedTime/1000000;
		System.out.println("Elapsed time : "+ elapsedTime+" ms");
		start = System.nanoTime();
		System.out.println(findDuplicateusingHashSet(arr));
		end = System.nanoTime();
		elapsedTime = end - start;
		elapsedTime = elapsedTime/1000000;
		System.out.println("Elapsed time : "+ elapsedTime+" ms");
	}
	static int findDuplicateExtraAr(int[] nums)
    {
        int[] dup = new int[nums.length];
        for(int i : nums)
        {
            if(dup[i] == 0) dup[i] = 1;
            else return i;
        }
        return 0;
    }
	static int findDuplicateTwoPointer(int[] nums)
    {
        int fast = nums[0];
        int slow = nums[0];
        //while(slow != fast)
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while( slow != fast);

        fast = nums[0];
        while(slow != fast)
        {
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }
	static int findDuplicateusingHashSet(int[] nums)
    {
        HashSet<Integer> set= new HashSet<Integer>();
        for(int i : nums)
        {
            if(!set.contains(i))
                set.add(i);
            else
                return i;
        }
        return 0;
    }
}