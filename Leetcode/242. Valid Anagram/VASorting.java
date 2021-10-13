class Solution
{
    public boolean isAnagram(String s, String t)
    {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        s = String.valueOf(chars);
        chars = t.toCharArray();
        Arrays.sort(chars);
        t = String.valueOf(chars);
        if(s.compareTo(t) == 0)
            return true;
        return false;
    }
}