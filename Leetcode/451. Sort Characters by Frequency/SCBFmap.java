class Solution
{
    public String frequencySort(String s)
    {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);
        List<Character> set = new ArrayList(map.keySet());
        Collections.sort(set, (a, b) -> (map.get(b) - map.get(a)));
        for(char ch : set)
        {
            for(int i = 0; i < map.get(ch); i++)
                sb.append(ch);
        }
        return sb.toString();
    }
}