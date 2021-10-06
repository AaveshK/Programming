public class Solution
{
    public int solve(String s)
    {
        int N = s.length();
        if(N < 3)
            return 0;
        else
        {
            for(int i = 0; i < N - 2; i++)
            {
                if((s.charAt(i) == s.charAt(i+1) || s.charAt(i) == s.charAt(i+2)) || (s.charAt(i+1) == s.charAt(i+2)))
                    return 1;
            }
            return 0;
        }
    }
}