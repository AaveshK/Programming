class Solution
{
    public int timeRequiredToBuy(int[] tickets, int k)
    {
        int time = 0;
        for(int i = 0; i < tickets.length; i++)
            time += (i <= k ? Math.min(tickets[k],tickets[i]) : Math.min(tickets[k]-1,tickets[i]));
        return time;
    }
}