public class Solution
{
    public int solve(int A, int B)
    {
        int count = 0;
        while(A > 0 && B > 0)
        {
            if(A < B)
                A = A/2;
            else
                B = B/2;
            count++;
        }
        if(A == 0 && B == 0)
            count += 2;
        else if(A + B == 1)
            count++;
        else if(A == 0 || B == 0)
            count +=2;
        return count;
    }
}