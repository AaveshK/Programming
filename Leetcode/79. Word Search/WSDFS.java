class Solution
{
    public boolean exist(char[][] board, String word)
    {
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[0].length; j++)
            {
                if(board[i][j] == word.charAt(0) && dfs(board,i,j,word,0))
                    return true;
            }
        }
        return false;
    }
    boolean dfs(char[][] board,int i, int j, String word, int id)
    {
        if(word.length() == id)
            return true;
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] == '*' || board[i][j] != word.charAt(id))
            return false;
        char temp = board[i][j];
        board[i][j] = '*';
        if(dfs(board,i+1,j,word,id+1) || dfs(board,i,j+1,word,id+1) || dfs(board,i-1,j,word,id+1) || dfs(board,i,j-1,word,id+1))
            return true;
        board[i][j] = temp;
        return false;
    }
}