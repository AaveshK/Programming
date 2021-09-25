class Solution
{
    public int[] dailyTemperatures(int[] temp)
    {
        Stack<Integer> stk = new Stack<>();
        int N = temp.length;
        int[] ret = new int[N];
        for(int i = 0; i < N; i++)
        {
            while(!stk.isEmpty() && temp[stk.peek()] < temp[i])
                ret[stk.peek()] = i - stk.pop();
            stk.push(i);
        }
        return ret;
    }
}