class Solution
{
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles)
    {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> word_freq = new HashMap<>();
        for(String word : words)
        {
            int mask = masking(word);
            word_freq.put(mask,word_freq.getOrDefault(mask,0)+1);
        }
        for(String puzzle : puzzles)
        {
            int first = 1 << (puzzle.charAt(0)-'a');
            int count = word_freq.getOrDefault(first,0);
            int mask = masking(puzzle.substring(1));
            for(int i = mask; i > 0; i = (i-1)&mask)
                count += word_freq.getOrDefault(i|first,0);
            list.add(count);
        }
        return list;
    }
    int masking(String word)
    {
        int mask = 0;
        for(char ch : word.toCharArray())
            mask |= 1<<(ch - 'a');
        return mask;
    }
}