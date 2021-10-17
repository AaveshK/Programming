class Solution
{
    public boolean areNumbersAscending(String s)
    {
        int last = -1;
        for(String i : s.split("\\s+"))
        {
            char ch = i.charAt(0);
            if(Character.isDigit(ch))
            {
                int x = Integer.parseInt(i);
                if(x > last)
                {
                    last = x;
                }
                else
                    return false;
            }
        }
        return true;
    }
}