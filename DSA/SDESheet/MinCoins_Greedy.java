package SDESheet;
/*

Works only if there exists no two denominations (sum) greater(or equal) than a third denomination.

E.g. {25, 10, 5}.
But it fails for {9, 6, 5, 1}, as for V = 11,
greedy approach gives us 9 + 1 + 1 whereas the optimal solution is 6 + 5.

*/

import java.util.*;
public class MinCoins_Greedy
{
    static int minCoins(int coins[], int M, int V) 
	{
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(coins);
        for(int i = M - 1; i >= 0; i--)
        {
            while(V >= coins[i])
            {
                V -= coins[i];
                ans.add(coins[i]);
            }
        }
        for(int i = 0; i < ans.size(); i++)
        {
            System.out.println(ans.get(i)+" ");
        }
        return ans.size();
    }
    public static void main(String[] args)
    {
        int[] temp = {9,6,5,1};
        System.out.println("Method 1");
        System.out.println(minCoins(temp,4,11));
        System.out.println("Method 2");
        System.out.println(minCoins2(temp,4,11));
    }
    static int minCoins2(int coins[], int M, int V) 
	{ 
	    Arrays.sort(coins);
	    int temp = V;
	    int tcomp = 0;
	    int count = 0;
	    for(int i = M - 1; i >= 0; i--)
	    {
	        if(coins[i] > temp)
	            continue;
	        count += temp / coins[i];
	        tcomp += (temp/coins[i])*coins[i];
	        temp = temp % coins[i--];
	        if(tcomp == V)
	            break;
	    }
	    if(count > 0 && tcomp == V)
	        return count;
	    else
	        return -1;
    }
}
