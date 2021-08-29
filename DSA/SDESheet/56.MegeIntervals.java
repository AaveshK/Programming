package DSA.SDESheet;

/*

Sample Input 1



Sample Output 1



*/

import java.util.*;
import java.lang.*;
import java.io.*;

class SolutionMI
{
    public int[][] merge(int[][] intervals)
    {
        sort2D(intervals);
        List<int[]> merged = new ArrayList<>();
        int l = intervals[0][0];
        int r = intervals[0][1];
        for(int i = 0; i < intervals.length; i++)
        {
            if(intervals[i][0] <= r)
                r = MAX(r, intervals[i][1]);
            else
            {
                merged.add(new int[]{l,r});
                l = intervals[i][0];
                r = intervals[i][1];
            }
        }
        
        merged.add(new int[]{l,r});
        return merged.toArray(new int[0][]);
    }
static int MAX(int x, int y){return ((x > y) ? x : y );}
static void sort2D(int[][] Arr){Arrays.sort(Arr, (a, b) -> Double.compare(a[0], b[0]));}
}