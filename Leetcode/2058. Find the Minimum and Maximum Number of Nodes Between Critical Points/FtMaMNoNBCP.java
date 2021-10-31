class Solution
{
    public int[] nodesBetweenCriticalPoints(ListNode head)
    {
        List<Integer> id = new LinkedList<>();
        int prev = head.val;
        head = head.next;
        int count = 0;
        int min = Integer.MAX_VALUE;
        while(head.next != null)
        {
            count++; // Counting the present index of node
            if((head.val > prev && head.val > head.next.val)||(head.val < prev && head.val < head.next.val)) // Checking for critical point
            {
                if(id.size() >= 1)
                    min = Math.min(min,count-id.get(id.size()-1)); // Comparing minimum and the current difference
                id.add(count);
            }
            prev = head.val; // Maintaining previous node's value
            head = head.next;
        }
        if(id.size() < 2)
            return new int[]{-1,-1};
        return new int[]{min,id.get(id.size()-1)-id.get(0)};
    }
}