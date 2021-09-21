class Solution
{
    public String longestCommonPrefix(String[] strs)
    {
        String pref = strs[0];
        int l = strs.length;
        for(int i = 0; i < l; i++)
        {
            while(strs[i].indexOf(pref) != 0)
            {
                pref = pref.substring(0,pref.length()-1);
            }
        }
        return l == 0 ? "" : pref;
    }
}