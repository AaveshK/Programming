class Trie
{
    Node root;
    public Trie()
    {
        root = new Node('~');
    }
    public void insert(String word)
    {
        Node curr = root;
        for(int i = 0; i < word.length(); i++)
        {
            char c = word.charAt(i);
            if(curr.children[c - 'a'] == null)
                curr.children[c - 'a'] = new Node(c);
            curr = curr.children[c - 'a'];
        }
        curr.isLeaf = true;
    }
    
    public boolean search(String word)
    {
        Node node = getNode(word);
        if(node != null && node.isLeaf == true)
            return true;
        else
            return false;
    }
    
    public boolean startsWith(String prefix)
    {
        Node node = getNode(prefix);
        if(node != null)
            return true;
        else
            return false;
    }
    private Node getNode(String word)
    {
        Node curr = root;
        for(int i = 0; i < word.length(); i++)
        {
            char c = word.charAt(i);
            if(curr.children[c - 'a'] == null)
                return null;
            curr = curr.children[c - 'a'];
        }
        return curr;
    }
    class Node
    {
        char c;
        boolean isLeaf;
        Node[] children;
        
        Node(char ch)
        {
            c = ch;
            isLeaf = false;
            children = new Node[26];
        }
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */