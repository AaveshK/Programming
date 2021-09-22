class Solution
{
    public int reverse(int x)
    {
        int ret = 0;
        while(x != 0)
        {
            if(ret > 214748364 || ret < -214748364 )
                return 0;
            else
                ret = ret *  10 + (x%10);
                x/=10;
        }
        return ret;
    }
}