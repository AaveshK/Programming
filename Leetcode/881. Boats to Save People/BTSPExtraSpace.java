class Solution
{
    public boolean isPalindrome(String s)
    {
        s = s.toLowerCase();
        char[] str = s.toCharArray();
        char[] temp = new char[s.length()];
        int count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(Character.isLetterOrDigit(str[i]))
                temp[count++] = str[i];
        }
        count--;
        if(count <= 0)
            return true;
        for(int i = 0; i <= count/2; i++)
        {
            if(temp[i] == temp[count - i])
                continue;
            else
                return false;
        }
        return true;
    }
}