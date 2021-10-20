class Solution
{
    public String reverseWords(String s)
    {
        String[] strs = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = strs.length - 1; i >= 0; i--)
        {
            if(!strs[i].isEmpty())
                sb.append(strs[i]+" ");
        }
        return sb.toString().trim();
    }
}