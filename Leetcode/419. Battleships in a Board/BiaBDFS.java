class Solution
{
    public int countBattleships(char[][] board)
    {
        int ret = 0;
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[0].length; j++)
            {
                if(board[i][j] == 'X')
                {
                    ret++;
                    dfs(board,i,j);
                }
            }
        }
        return ret;
    }
    void dfs(char[][] board, int i, int j)
    {
        board[i][j] = '.';
        if(i >= 1 && board[i-1][j] == 'X')
            dfs(board,i-1,j);
        if(i < board.length - 1 && board[i+1][j] == 'X')
            dfs(board,i+1,j);
        if(j >= 1 && board[i][j-1] == 'X')
            dfs(board,i,j-1);
        if(j < board[0].length - 1 && board[i][j+1] == 'X')
            dfs(board,i,j+1);
    }
}