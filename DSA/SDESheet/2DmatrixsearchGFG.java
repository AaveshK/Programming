import java.io.*;
import java.util.*;
public class Main
{
    // Driver code
    public static void main(String[] args)
    {
        int mat[][] = { { 10, 20, 30, 40 },
                        { 15, 25, 35, 45 },
                        { 27, 29, 37, 48 },
                        { 32, 33, 39, 50 } };
 
        search(mat, 29);
    }
    static void search(int[][] mat,int x)
    {
        int i = 0;
        int j = mat.length - 1;
        while( i < mat.length && j >= 0)
        {
            if(mat[i][j] == x)
                {System.out.println("Found at :"+(i+1)+" "+ (j+1)); return;}
            if(mat[i][j] > x)
                j--;
            else
                i++;
        }
        System.out.println("Not found");
    }
}