class Solution
{
    public String longestCommonPrefix(String[] strs)
    {
        String temp = "";
        String ret="";
        for(int i = 0; i < strs[0].length(); i++)
        {
            temp = temp+strs[0].charAt(i);
            for(String s : strs)
            {
                if(s.indexOf(temp)==0)
                    continue;
                else
                    return ret;
            }
            ret = temp;
        }
        return ret;
    }
}