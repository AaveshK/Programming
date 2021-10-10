class Solution
{
    public boolean isPalindrome(String s)
    {
        s = s.toLowerCase();
        char[] str = s.toCharArray();
        int j = s.length() - 1;
        int i = 0;
        while(i <= j)
        {
            if(!Character.isLetterOrDigit(str[i]))
                i++;
            else if(!Character.isLetterOrDigit(str[j]))
                j--;
            else if(str[i] == str[j])
            {
                i++;
                j--;
            }
            else
                return false;
        }
        return true;
    }
}