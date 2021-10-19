public class Solution
{
    public int books(int[] A, int B)
    {
        if(B > A.length)
            return -1;
        int ret = -1;
        int lb = A[0];
        int ub = 0;
        for(int i : A)
        {
            ub += i;
            lb = Math.min(lb,i);
        }
        while(lb <= ub)
        {
            int mid = lb + (ub - lb)/2;
            if(canAlloc(A,mid,B))
            {
                ret = mid;
                ub = mid-1;
            }
            else
            lb = mid + 1;
        }
        return ret;
    }
    static boolean canAlloc(int[] A, int limit, int B)
    {
        int allotted = 1;
        int current = 0;
        for(int i = 0; i < A.length; i++)
        {
            if(A[i] > limit)
                return false;
            if(current + A[i] <= limit)
            {
                current += A[i];
            }
            else
            {
                allotted++;
                current = A[i];
            }
        }
        if(allotted <= B)
            return true;
        else
            return false;
    }
}
