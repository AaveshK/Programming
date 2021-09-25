class Solution
{
    public int[] dailyTemperatures(int[] temp)
    {
        Stack<Integer> stk = new Stack<>();
        int N = temp.length;
        for(int i = 0; i < N; i++)
        {
            while(!stk.isEmpty() && temp[stk.peek()] < temp[i])
                temp[stk.peek()] = i - stk.pop();
            stk.push(i);
        }
		while(!stk.isEmpty())
		{
			temp[stk.pop()] = 0;
		}
        return temp;
    }
}