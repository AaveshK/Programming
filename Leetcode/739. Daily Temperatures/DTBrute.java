class Solution
{
    public int[] dailyTemperatures(int[] temp)
    {
        int N = temp.length;
        int flag = 0;
        for(int i = 0; i < N; i++)
        {
            flag = 0;
            for(int j = i; j < N; j++)
            {
                if(temp[j] > temp[i])
                {
                    temp[i] = j-i;
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
                temp[i] = 0;
        }
        return temp;
    }
}