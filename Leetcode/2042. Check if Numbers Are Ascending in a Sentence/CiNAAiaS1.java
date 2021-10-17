class Solution
{
    public boolean areNumbersAscending(String s)
    {
        String[] strs = s.split("\\s+");
        int last = -1;
        for(String i : strs)
        {
            if(isNumeric(i))
            {
                if(Integer.parseInt(i) <= last)
                    return false;
                else
                    last = Integer.parseInt(i);
            }
            else
                continue;
        }
        return true;
    }
    public static boolean isNumeric(String str)
    {
        for (char c : str.toCharArray())
        {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
}