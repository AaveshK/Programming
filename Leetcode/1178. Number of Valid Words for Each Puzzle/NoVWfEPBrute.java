// Passes 9/10 TCs. For 10th, TLE.
class Solution
{
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(String puzzle : puzzles)
        {
            int count = 0;
            HashSet<Character> uniq = new HashSet<Character>();
            for(char ch : puzzle.toCharArray())
                uniq.add(ch);
            for(String word : words)
            {
                boolean flag = false;
                for(int i = 0; i < word.length(); i++)
                {
                    if(puzzle.charAt(0) == word.charAt(i))
                        flag = true;
                    if(!uniq.contains(word.charAt(i)))
                    {
                        flag = false;
                        break;
                    }
                }
                if(flag == true)
                    count++;
            }
            list.add(count);
        }
        return list;
    }
}